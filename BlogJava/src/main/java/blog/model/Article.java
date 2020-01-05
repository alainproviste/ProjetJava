package blog.model;

public class Article {
	private int id;
	private String titre;
	private String description;
	private String texte;
	private String auteur;
	private int id_auteur;
	private String date;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public int getId_auteur() {
		return id_auteur;
	}
	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
