package Package_ZEMIS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestCompteur {
	protected FonctionCompteur Compteur;

	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("TestCompteur - @Before ...");	
		Compteur = new FonctionCompteur();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("TestCompteur - @After ...");	
	}

	@Test ( expectedExceptions = RuntimeException.class )
	public void test() {
		System.out.println("TestCompteur - @Test ...");	
		try {
			// x doit être compris entre 1 et 255, sinon erreur
			int result = Compteur.count(2000);
			if (result == 15) 	
				System.out.println("Compteur - Correct");
			else				
				System.out.println("Compteur - Faux");
		}
		catch(RuntimeException e){
		  System.out.println(e.toString());
		}
	}
}
