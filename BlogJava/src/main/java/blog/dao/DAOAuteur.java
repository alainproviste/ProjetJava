package blog.dao;

import java.util.List;

import blog.model.Auteur;

public interface DAOAuteur {
	public Auteur getAuteur(int id);
	
	public List<Auteur> getAllAuteurs();
	
	public void addAuteur(Auteur auteur);
	
}
