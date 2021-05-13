package Package_ZEMIS;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestPersonne {

	FonctionPersonneSuite Personne; 
	public int nbLinefic = 0;  // Nbre de lignes du fichier
	public int i = 0;
	public String sb2 = null;	// Donn�es r�cup�r�e du fichier
	
	// 1�re m�thode appel�e
	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("Methode @Before");
		// M�thode pour r�cup�rer les donn�es du fichier
		Personne = new FonctionPersonneSuite(); 
		
		 try{
			// contenu du fichier (sb2) + nbre de lignes
			sb2 = FonctionEntreeSortie.readerToString("C:\\Projet Eclipse\\essai.txt"); 
			nbLinefic = FonctionEntreeSortie.readernbLine(); 
		 }
		 catch (IOException e) {
			 	System.err.println(e);
		 }	
	}

	// Derni�re m�thode appel�e
	@AfterClass
	public void tearDown() {
		System.out.println("Methode @After");
}

	// 1er test de la m�thode
	@Test ( expectedExceptions = IllegalArgumentException.class )
	public void test1() {
		System.out.println("Methode @Test1");
		
		String Resultat = null;
		
		System.out.println("Appel Test 1 ");	
		try {
			 for (i=0; i<nbLinefic;i++)
			 {
				 String[] ligne = sb2.split(":");			 
			 
				 // 0=Pos, 1=Nom, 2=Pr�nom 3=Date de naissance 4=sexe 5=Adresse 6=tel
				 String[] parts = ligne[i].split(";");	
				 Personne.setPos(Integer.parseInt(parts[0]));
				 Personne.setNom(parts[1]);
				 Personne.setPrenom(parts[2]);
				 Personne.setDateNaissance(parts[3]);
				 Personne.setSexe(parts[4]);
				 Personne.setAdresse(parts[5]);
				 Personne.setNumtel(parts[6]);

				 Personne.InfoPersonneSuite(Personne.getNom(), Personne.getPrenom(), Personne.getDateNaissance(), 
							   Personne.getSexe(), Personne.getAdresse(), Personne.getNumtel());
				 
				 Resultat = Personne.toStringPersonneSuite();
				 System.out.println("Ligne: " + String.valueOf(i+1) + " " + Resultat);
				 System.out.println("Nom: " + Personne.getNom() + "Pr�nom : " + Personne.getPrenom() );

			 }
		}
		catch (IllegalArgumentException e) {
			  System.out.println("IllegalArgumentException");
			  System.out.println(e.toString());
		}		
	}
	
	@Test 
	public void test2() {
		System.out.println("Methode @Test2");
		//FonctionPersonne[] tableau;   // un tableau de type FonctionPersonne
	
		//tableau = new FonctionPersonne[4]; // tableau pour 4 variables de type FonctionPersonne
	
		FonctionPersonne[] tableau = new FonctionPersonne[4];	
		tableau[0] = new FonctionPersonne (0, "Bonguardo", "Maryse");		
		tableau[1] = new FonctionPersonne (1, "Bonguardo", "Patrick");
		tableau[2] = new FonctionPersonne (2, "Bonguardo", "Justine");
		tableau[3] = new FonctionPersonne (3, "Bonguardo", "Lucas");
	
		//for (FonctionPersonne c : tableau) System.out.println(tableau[i]);
		System.out.println("pos 0 " + tableau[0].toStringPersonne());
		System.out.println("pos 1 " + tableau[1].toStringPersonne());
		System.out.println("pos 2 " + tableau[2].toStringPersonne());
		System.out.println("pos 3 " + tableau[3].toStringPersonne());
	}
}
