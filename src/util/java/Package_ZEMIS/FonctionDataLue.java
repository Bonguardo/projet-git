package Package_ZEMIS;

public class FonctionDataLue {
	  private int Indice;
	  private String Nom;
	  private String Prenom;
	  private String DateNaissance;
	  private String Adresse;
	  

	  public void DataLue(int indice, String nom, String prenom, String datenaissance, String adresse) {
		this.Indice = indice;
		this.Nom = nom;
	    this.Prenom = prenom;
	    this.DateNaissance = datenaissance;
	    this.Adresse = adresse;
	  }

	  public int getIndice() {
		    return Indice;
		  }

	  public void setIndice(int indice) {
		    this.Indice = indice;
		  }

	  public String getNom() {
	    return Nom;
	  }

	  public void setNom(String nom) {
	    this.Nom = nom;
	  }

	  public String getPrenom() {
	    return Prenom;
	  }

	  public void setPrenom(String prenom) {
	    this.Prenom = prenom;
	  }

	  public String getDateNaissance() {
		    return DateNaissance;
	  }

	 public void setDateNaissance(String datenaissance) {
		    this.DateNaissance = datenaissance;
	 }
	 
	 public String getAdresse() {
		 return Adresse;
	 }

	 public void setAdresse(String adresse) {
		this.Adresse = adresse;
	 }
	 
	  public String toString() {
		return "Person [Indice=" + Indice + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNaissance=" + DateNaissance + ", Adresse=" + Adresse + "]";
	  }
}
