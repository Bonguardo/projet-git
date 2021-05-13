package Package_ZEMIS;

public class FonctionPersonne {
	  private int Pos;
	  private String Nom;
	  private String Prenom;
	  
	  // constructeur de la classe
	  FonctionPersonne() {
		   	this.Pos = 0;
		   	this.Nom = null;
		   	this.Prenom = null;
	  }

	  FonctionPersonne(int pos, String nom, String prenom) {
				this.Pos = pos;
				this.Nom = nom;
			    this.Prenom = prenom;
	  }	  
	  
	  public void setPersonne(int pos, String nom, String prenom) {
		this.Pos = pos;
		this.Nom = nom;
	    this.Prenom = prenom;
	  }

	  public String getNom() {
	    return Nom;
	  }
	  public String getPrenom() {
		    return Prenom;
	  }
	  public int getPos() {
		  return Pos;
	  }

	  public void setNom(String nom) {
		if (nom == null) {
			throw new IllegalArgumentException ("le nom ne peut pas être null");
		}
	    this.Nom = nom;
	  }
	  public void setPrenom(String prenom) {
		if (prenom == null) {
			throw new IllegalArgumentException ("le prénom ne peut pas être null");
		}
		this.Prenom = prenom;
	  }
	  public void setPos(int pos) {
		  this.Pos = pos;
	  }

	  // Retourne nom + prénom
	  public String toStringPersonne() {
	    return Pos + ";" + Nom + ";" + Prenom;
	  }
}
