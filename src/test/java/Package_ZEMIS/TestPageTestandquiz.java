package Package_ZEMIS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPageTestandquiz {
	private static WebDriver driver;

	static private String DataLue;
	static int nbLinefic;			// Nbre de lignes du fichier

	static HashMap<String,PersonneZemis> map = new HashMap<>();
	static ArrayList<PersonneZemis> Listep = new ArrayList<>(); 
	static ArrayList<PersonneZemis> ListeLue = new ArrayList<>(); 
	
	@BeforeTest
	public static void setUpBeforeTests() throws Exception {
		System.out.println("setUpBeforeTest");
		FonctionProperties config = new FonctionProperties();
		System.out.println(config.getNom() + " " + config.getPrenom() + " " + config.getRepertoire());
		
		DataLue = FonctionEntreeSortie.readerToString("C:\\ExemplesJava\\ZEMIS\\FichierData.txt"); 
		nbLinefic = FonctionEntreeSortie.readernbLine(); 
	        
		System.out.println("nbLinefic: " + nbLinefic + "Data lue: " +  DataLue);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {

		System.out.println("setUpBeforeClasss : " + nbLinefic);
		try {
		 for (int i=0; i<nbLinefic;i++)
		 {
			 String[] ligne = DataLue.split(":");		

			 // 0=NumZemis, 1=Nom, 2=Prénom 3=Date de naissance 4=sexe
			 String[] parts = ligne[i].split(";");	
			 map.put(parts[0], new PersonneZemis(parts[0],parts[1], parts[2], parts[3], parts[4]));
			 
			 PersonneZemis p = new PersonneZemis(parts[0],parts[1], parts[2], parts[3], parts[4]);	 
			 Listep.add(p);
		 }	
         
		 // afficher la Hashmap
		 for (Object name: map.keySet()) {
			   Object key = name.toString();
			   PersonneZemis zi = map.get(key);
			   System.out.println("Hashmap : " + key + " " + zi.getNom() + zi.getPrenom() + zi.getDateNaissance() + zi.getSexe());
		 }
		 
		 // Afficher la liste
		 for (int i = 0; i< Listep.size() ; i++) 
			 System.out.println("Liste : " + i + " " + 
					 Listep.get(i).getNunZemis() + Listep.get(i).getNom() + 
					 Listep.get(i).getPrenom() + Listep.get(i).getDateNaissance() +
					 Listep.get(i).getSexe());
		 
		 
		 // Afficher la liste récupérée par la méthode
		 ListeLue = FonctionLectureData.readerToString("C:\\ExemplesJava\\ZEMIS\\FichierData2.txt");
		 for (int i = 0; i< ListeLue.size() ; i++) 
			 System.out.println("ListeLue : " + i + " " + 
					 ListeLue.get(i).getNunZemis() + ListeLue.get(i).getNom() + 
					 ListeLue.get(i).getPrenom() + ListeLue.get(i).getDateNaissance() +
					 ListeLue.get(i).getSexe());
		 
		}
		catch (IllegalArgumentException e) {
		  System.out.println("IllegalArgumentException");
		  System.out.println(e.toString());
		}		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test (priority = 1)
	public void ParametersTest(){
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWeb\\geckodriver.exe");
		
		driver = new FirefoxDriver ();
		AssertJUnit.assertTrue(true);

		/*
		if (String.valueOf(Brother).contentEquals("Firefox") == true )
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWeb\\geckodriver.exe");
			
			driver = new FirefoxDriver ();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		*/
	}
	
	@Test(priority = 2, dependsOnMethods={"ParametersTest"}, alwaysRun = true)
	public void LanceAppli() {
		//public void LanceAppli() {
			driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		// Cliquer sur un lien
	    //driver.findElement(By.linkText("This is a link")).click();  

		PageTestandquiz Page = new PageTestandquiz(driver);
		
		// Ecrire un texte
		Page.setName("Ceci est un message 2");

		// Bouton radio (sexe)
		//Page.clickOnSexe("Male");
		Page.clickOnSexe("Female");
		
		//Checkbox : 
		//Page.clickOnType(".Automation");
		Page.clickOnType(".Performance");
		
		// menu déroulant
		Page.SelectMenu(2);    
		
		// vérifier que tous les champs sont renseignés
		if ( Page.isOKPageMaj (Page, "Female", ".Performance") == true) AssertJUnit.assertTrue(true);
		else AssertJUnit.assertTrue(false);
	}
}
