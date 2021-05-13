package Package_ZEMIS;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FonctionEntreeSortie {
	
	public static int nbLine;
	
	// Effacer un fichier
	public static Boolean deleteFile (String FileName)
	throws SecurityException , NullPointerException {
		File bck = new File(FileName);
		return bck.delete();
/*		if (!bck.delete())
	   		System.out.println("Impossible de supprimer le fichier : " + FileName);
		else
	   		System.out.println("Fichier :" + FileName+ " " + "supprimé");
*/
	}

	// Copier un fichier
	public static void copyFile (String inName, String outName)
	throws FileNotFoundException, IOException {
		BufferedInputStream is = new BufferedInputStream(new FileInputStream (inName));
		BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream (outName));
		copyFile (is, os, true);
	}

	// Copie fichier Input et Output ouverts
	public static void copyFile (InputStream is, OutputStream os, boolean close)
	throws IOException {
		int b;	// octet lu
		while ( (b = is.read ()) != -1) os.write(b);
		is.close();
		if (close) os.close();
	}
		
	// Copie fichiers : les 2 fichiers sont ouverts
	public static void copyFile (Reader is, Writer os, boolean close)
	throws IOException {
		int b;	// octet lu
		while ( (b = is.read ()) != -1)	os.write(b);
		is.close();
		if (close) os.close();
	}
		
	// lire la 1ère ligne d'un fichier
	public static String readFile (String inName)
		throws FileNotFoundException, IOException {
	
		BufferedReader is = new BufferedReader (new FileReader(inName));
		String line = null;
		line = is.readLine();
		is.close();
		return line;
	}
	
	// lire tout le fichier
	public static String readerToString (String inName)	
		throws IOException {
	    
		BufferedReader is = new BufferedReader (new FileReader(inName));
		String line = null;
		nbLine = 0;
		StringBuffer sb = new StringBuffer();
		
		// Séparer chaque ligne lue par ":" et concaténer dans un BufferedReader
		while ( (line = is.readLine()) != null){
		 	sb.append(line + ":");
		 	nbLine++;
		}
		String s = sb.toString();
		is.close();
		return s;
	}
	
	public static int readernbLine () {
			return nbLine;
	}
}
