package Package_ZEMIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDemoqaLogin {
	WebDriver driver;

	public PageDemoqaLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername (String Login) {
		driver.findElement(By.id("userName")).sendKeys(Login);;
	}
	public String getUsername () {
		return driver.findElement(By.id("userName")).getAttribute("value");
	}

	
	public void setPassword (String Password) {			
		driver.findElement(By.id("password")).sendKeys(Password);

	}
	public String getPassword () {
		return driver.findElement(By.id("password")).getAttribute("value");
	}

	public boolean isLoginCorrect (String usrNm) {
		 if(driver.findElement(By.id("userName")).getAttribute("value").equalsIgnoreCase(usrNm))
			 return true;
		 else
			 return false;
	}
		
	public boolean isPasswordCorrect (String Pwd){
		if(driver.findElement(By.id("password")).getAttribute("value").equalsIgnoreCase(Pwd))
			 return true;
		 else
			 return false;
	}
	
	public void login (String Username, String Password)
	{
		driver.findElement(By.id("userName")).click();
		setUsername (Username); 
		driver.findElement(By.id("password")).click();
		setPassword (Password);
		driver.findElement(By.id("login")).click();
	}
	
	public void clicknewUser ()
	{
		driver.findElement(By.id("newUser")).click();
	}
	
	public boolean isOKUsernamePassword (String Text) {	
		if(driver.getPageSource().contains(Text)) return true;
		return false;
	}
	
	public boolean isLoginOK (String usrNm, String Password) {	
		if (isLoginCorrect (usrNm) && isPasswordCorrect (Password)) return true;
		return false;
	}
}
