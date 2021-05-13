package Package_ZEMIS;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestPageDemoqaLogin {
	
	private static WebDriver driver;
    private static Logger log = Logger.getLogger(TestPageDemoqaLogin.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		// le fichier .properties doit se trouver C:\ExemplesJava\ZEMIS
		PropertyConfigurator.configure("log4j2.properties");
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWeb\\geckodriver.exe");
		driver = new FirefoxDriver();
		log.debug("Configuration webdriver");  
	
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.debug("Close webdriver");  
		driver.close();
	}


	// Saisir le login/pwd
	@Test (priority = 1)
	public void PageDemo() {
		log.debug("Appel PageDemo");  		
		driver.get("https://demoqa.com/login");

		PageDemoqaLogin loginPage = new PageDemoqaLogin(driver);
		loginPage.login("Bonguardo", "Maryse");
		log.debug("Saisir login/pwd");  		
		
		// saisie login/mot de passe + vérifier
		loginPage.isLoginOK("Bonguardo", "Maryse");
		if (loginPage.isOKUsernamePassword("Invalid username or password!") == true) 
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		log.debug("Vérification login/pwd");  		
	}
	
	// appel cette page seulement si login/pwd sont faux
	@Test (priority = 2, dependsOnMethods={"PageDemo"}, alwaysRun = false)
	public void Pageregister() {
		log.debug("Appel Pageregister");  		

		PageDemoqaLogin loginPage = new PageDemoqaLogin(driver);
		PageRegister Register = new PageRegister(driver);

		// saisir le nouveau login 
		loginPage.clicknewUser();
		log.debug("Appel clicknewUser");  		

		// Enregistrer le compte
		Register.clickSavLogin("Bonguardo", "Maryse", "Bonguardo", "Justine");
		log.debug("Appel clickSavLogin");  		

		if (loginPage.isLoginCorrect ("Maryse") == true)
			log.debug("Correct username, ie " + loginPage.getUsername());
		else
			log.debug("Incorrect username, ie " + loginPage.getUsername());
			
		if (loginPage.isPasswordCorrect ("Justine") == true)
				log.debug("Correct password, ie " + loginPage.getPassword());
		else
			log.debug("Incorrect password, ie " + loginPage.getPassword());

			//Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
}
