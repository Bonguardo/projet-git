package Package_ZEMIS;

public class FonctionPersonneSuite extends FonctionPersonne {
	  private String DateNaissance = null;
	  private String Sexe = null;
	  private String Adresse = null;
	  private String Numtel= null;

	  public void InfoPersonneSuite(String nom, String prenom, String DateNaissance, String Sexe, String adresse, String Numtel) {
		    setNom(nom);
		    setPrenom(prenom);
		    this.DateNaissance = DateNaissance;
		    this.Sexe = Sexe;
		    this.Adresse = adresse;
		    this.Numtel = Numtel;
		  }
	  
	  public void setDateNaissance (String DateNaissance) {
		  this.DateNaissance = DateNaissance;
	  }
	  public void setSexe (String Sexe) {
		  this.Sexe = Sexe;
	  }
	  public void setAdresse (String Adresse) {
		  this.Adresse = Adresse;
	  }
	  public void setNumtel (String Numtel) {
		  this.Numtel = Numtel;
	  }


	  public String getDateNaissance () {
		  return this.DateNaissance;
	  }
	  public String getSexe () {
		  return this.Sexe;
	  }
	  public String getAdresse () {
		  return this.Adresse;
	  }
	  public String getNumtel () {
		  return this.Numtel;
	  }

	  public String toStringPersonneSuite() {
		    return getPos() + ";" + getNom() + ";" + getPrenom() + ";" + getDateNaissance() + ";" + 
	               getSexe() + ";" + getAdresse() + ";" + getNumtel() ;
	  }
}
