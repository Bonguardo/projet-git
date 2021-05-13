package Package_ZEMIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageTestandquiz {
	WebDriver driver;
	
	public PageTestandquiz(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// champ texte
	public void setName (String Texte)
	{
		//<input id="fname" type="text" name="firstName" ></p>
		
		//driver.findElement(By.id("fname")).sendKeys(Texte);		
		driver.findElement(By.xpath("//input[@id='fname'])")).sendKeys(Texte);

	}
	public boolean getName ()
	{
		if (driver.findElement(By.id("fname")).getAttribute("value").contentEquals("")) return false;
		return true;
	}
	
	// Bouton radio "Male" ou "Female"
	public void clickOnSexe (String Sexe)
	{
		//<input id="male" type="radio" name="gender" value="male"> Male  
		//<input id="female" type="radio" name="gender" value="female"> Female

		// driver.findElement(By.id("Male")).click();		
		// driver.findElement(By.id("Female")).click();
		driver.findElement(By.id(Sexe)).click();
	}
	public boolean getSexe (String Sexe)
	{
		if (driver.findElement(By.id(Sexe)).isSelected()) return true;
		return false;
	}
	
	// Checkbox
	public void clickOnType (String Type)
	{
		//<input type="checkbox" class="Automation" value="Automation"> Automation Testing
		//<input type="checkbox" class="Performance" value="Performance"> Performance Testing
		// driver.findElement(By.cssSelector(".Automation")).click();
		// driver.findElement(By.cssSelector(".Performance")).click();
		driver.findElement(By.cssSelector(Type)).click();
	}
	public boolean getType (String Type)
	{
		if (driver.findElement(By.cssSelector(Type)).isSelected()) return true;
		return false;
	}
	
	// menu déroulant
	public void SelectMenu (int indice)
	{
		Select Dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		Dropdown.selectByIndex(indice); // L'indice commence à 0	
	}	
	
	public boolean isOKPageMaj (PageTestandquiz Page, String Sexe, String Type) {	
		if ( (Page.getName() == true) && (Page.getSexe(Sexe) == true) && (Page.getType(Type) == true) ) return true;
		return false;
	}

}
