package Package_ZEMIS;

public class PersonneZemis {
	private String NumZemis;
	private String Nom;
	private String Prenom;
	private String DateNaissance;
	private String Sexe;
	    
	public PersonneZemis() {
	   	this.NumZemis = null;
	   	this.Nom = null;
	   	this.Prenom = null;
	   	this.DateNaissance = null;
	   	this.Sexe = null;
	}

	public PersonneZemis (String numZemis, String nom, String prenom, String dateNaissance, String sexe) {
	   	this.NumZemis = numZemis;
	   	this.Nom = nom;
	   	this.Prenom = prenom;
	   	this.DateNaissance = dateNaissance;
	   	this.Sexe = sexe;
	}	

	public void setPersonneZemis (String numZemis, String nom, String prenom, String dateNaissance, String sexe) {
	   	this.NumZemis = numZemis;
	   	this.Nom = nom;
	   	this.Prenom = prenom;
	   	this.DateNaissance = dateNaissance;
	   	this.Sexe = sexe;
	}	
	
	public String getNunZemis() {
		  return NumZemis;
	}

	public String getNom() {
		  return Nom;
	}
	
	public String getPrenom() {
		  return Prenom;
	}
	
	public String getDateNaissance() {
		  return DateNaissance;
	}
	
	public String getSexe() {
		  return Sexe;
	}

	public void setNumZemis(String numZemis) {
		if (numZemis == null) {
			throw new IllegalArgumentException ("le numéro SYMIC ne peut pas être null");
		}
	    this.NumZemis = numZemis;
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
	  
	public void setDateNaissance(String dateNaissance) {
		  if (dateNaissance == null) {
				throw new IllegalArgumentException ("la date de naissance ne peut pas être null");
			}
		    this.DateNaissance = dateNaissance;
	}
	  
	public void setSexe(String sexe) {
			if (sexe == null) {
				throw new IllegalArgumentException ("le sexe ne peut pas être null");
			}
		    this.Sexe = sexe;
	}		 
	
    @Override
    public String toString() {
        return "Personne{"+
                "nom=" + Nom +
                ", Prenom='" + Prenom + 
                ", Date=" + DateNaissance +
               ", Sexe=" + Sexe +
                '}';
    }

}
