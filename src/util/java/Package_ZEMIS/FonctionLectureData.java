package Package_ZEMIS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FonctionLectureData {
	
	static ArrayList<PersonneZemis> Listep = new ArrayList<>(); 
	
	// lire tout le fichier - sortie liste de Personnes
	public static ArrayList<PersonneZemis> readerToString (String inName)	
		throws IOException {
	    
		BufferedReader is = new BufferedReader (new FileReader(inName));
		String line = null;
		
		// Séparer chaque ligne lue par ":" et concaténer dans un BufferedReader
		while ( (line = is.readLine()) != null){
 	
			 // 0=NumZemis, 1=Nom, 2=Prénom 3=Date de naissance 4=sexe
			 String[] parts = line.split(";");	
			 PersonneZemis p = new PersonneZemis(parts[0],parts[1], parts[2], parts[3], parts[4]);	 
			 Listep.add(p);
		}
		is.close();
		return Listep;
	}
}
