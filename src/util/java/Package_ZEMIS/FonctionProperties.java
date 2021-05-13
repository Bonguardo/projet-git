package Package_ZEMIS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FonctionProperties {
	Properties config = new Properties();
	private String nom = null;
	private String prenom = null;
	private String rep = null;
	
	public FonctionProperties(){
		try {
			FileInputStream fic = new FileInputStream("C:\\ExemplesJava\\ZEMIS\\src\\util\\java\\config.properties");
			config.load(fic); 
			fic.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		this.nom = config.getProperty("Nom");
		this.prenom = config.getProperty("Prenom");
		this.rep = config.getProperty("Repertoire");
	}
	
	public String getNom () {
		return nom;
	}	
	public String getPrenom() {
		return prenom;
	}	
	public String getRepertoire() {
		return rep;
	}

}
