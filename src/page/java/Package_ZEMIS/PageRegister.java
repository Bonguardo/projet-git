package Package_ZEMIS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister {
	WebDriver driver;

	public PageRegister(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setFirstName (String Firstname) {
		driver.findElement(By.id("firstname")).sendKeys(Firstname);;
	}
	public void setLastName (String Lastname) {
		driver.findElement(By.id("lastname")).sendKeys(Lastname);;
	}
	public void setUserName (String Login) {
		driver.findElement(By.id("userName")).sendKeys(Login);;
	}
	public void setPassword (String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);;
	}

	public void getFirstName () {
		driver.findElement(By.id("firstname")).getAttribute("value");
	}
	public void getLastName () {
		driver.findElement(By.id("lastname")).getAttribute("value");
	}
	public String getUserName () {
		return driver.findElement(By.id("userName")).getAttribute("value");
	}
	public String getPassword () {
		return driver.findElement(By.id("password")).getAttribute("value");
	}
	
	public void clickSavLogin (String Firstname, String Lastname, String Username, String Password)
	{
		driver.findElement(By.id("firstname")).click();
		setFirstName (Firstname); 
		driver.findElement(By.id("lastname")).click();
		setLastName (Lastname);
		driver.findElement(By.id("userName")).click();
		setUserName (Username);
		driver.findElement(By.id("password")).click();
		setPassword (Password);
		driver.findElement(By.id("login")).click();
		System.out.println("Methode fin clickSavLogin");

		driver.findElement(By.id("gotologin")).click();
	}
}
