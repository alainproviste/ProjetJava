package blog.model;

public class Auteur {
	private int id;
	private String nom;
	private String identifiant;
	private String mdp;
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
