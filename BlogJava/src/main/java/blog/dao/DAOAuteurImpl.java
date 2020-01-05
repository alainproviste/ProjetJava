package blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import blog.model.Auteur;


public class DAOAuteurImpl implements DAOAuteur {
	private java.sql.Connection connection;
	private Auteur auteur;

	public DAOAuteurImpl(Connection connection) {
		this.connection = connection;
	}

	public Auteur getAuteur(int id) {
		Auteur auteur = new Auteur();
		try {
			String query = "SELECT * FROM auteur WHERE Id_auteur=?;";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet resultat = ps.executeQuery();
			while(resultat.next()) {
				auteur.setId(resultat.getInt("Id_auteur"));
				auteur.setNom(resultat.getString("Nom"));
				auteur.setIdentifiant(resultat.getString("Identifiant"));
				auteur.setMdp(resultat.getString("Mdp"));
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return auteur;
	}

	public List<Auteur> getAllAuteurs() {
		ArrayList<Auteur> auteurs = new ArrayList<Auteur>();
		try {
			String query = "SELECT * FROM auteur;";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet resultat = ps.executeQuery();
			while(resultat.next()) {
				Auteur a = new Auteur();
				a.setId(resultat.getInt("Id_auteur"));
				a.setNom(resultat.getString("Nom"));
				a.setIdentifiant(resultat.getString("Identifiant"));
				a.setMdp(resultat.getString("Mdp"));
				auteurs.add(a);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return auteurs;
	}

	public void addAuteur(Auteur auteur) {
		try {
    		PreparedStatement preparedStatement = connection.prepareStatement(
    				"INSERT INTO auteur (Nom,Identifiant,Mdp)"
    				+ "VALUES(?,?,?);");
    		preparedStatement.setString(1, auteur.getNom());
    		preparedStatement.setString(2, auteur.getIdentifiant());
    		preparedStatement.setString(3, auteur.getMdp());
    		
    		int statut = preparedStatement.executeUpdate();
    	}catch (SQLException e) {
    		System.out.println(e);
    	}
		
	}
	
}