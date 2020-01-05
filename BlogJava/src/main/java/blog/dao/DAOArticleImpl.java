package blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import blog.model.Article;


public class DAOArticleImpl implements DAOArticle {
	private java.sql.Connection connection;
	private Article article;

	public DAOArticleImpl(Connection connection) {
		this.connection = connection;
	}

	public Article getArticle(int id) {
		Article article = new Article();
		try {
			String query = "SELECT * FROM article WHERE Id_article=?;";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet resultat = ps.executeQuery();
			while(resultat.next()) {
				article.setId(resultat.getInt("Id_article"));
				article.setTitre(resultat.getString("Titre"));
				article.setDescription(resultat.getString("Description"));
				article.setTexte(resultat.getString("Texte"));
				article.setAuteur(resultat.getString("Auteur"));
				article.setId_auteur(resultat.getInt("Id_auteur"));
				article.setDate(resultat.getString("Date"));
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return article;
	}

	public List<Article> getAllArticles() {
		ArrayList<Article> articles = new ArrayList<Article>();
		try {
			String query = "SELECT * FROM article;";
			PreparedStatement ps = connection.prepareStatement(query);
					
			ResultSet resultat = ps.executeQuery();
			while(resultat.next()) {
				Article a = new Article();
				a.setId(resultat.getInt("Id_article"));
				a.setTitre(resultat.getString("Titre"));
				a.setDescription(resultat.getString("Description"));
				a.setTexte(resultat.getString("Texte"));
				a.setAuteur(resultat.getString("Auteur"));
				a.setId_auteur(resultat.getInt("Id_auteur"));
				a.setDate(resultat.getString("Date"));
				articles.add(a);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return articles;
	}

	public void addArticle(Article article) {
		try {
    		PreparedStatement preparedStatement = connection.prepareStatement(
    				"INSERT INTO article (Titre,Description,Texte,Auteur,Id_auteur)"
    				+ "VALUES(?,?,?,?,?);");
    		preparedStatement.setString(1, article.getTitre());
    		preparedStatement.setString(2, article.getDescription());
    		preparedStatement.setString(3, article.getTexte());
    		preparedStatement.setString(4, article.getAuteur());
    		preparedStatement.setInt(5, article.getId_auteur());
    		
    		int statut = preparedStatement.executeUpdate();
    	}catch (SQLException e) {
    		System.out.println(e);
    	}
		
	}

	public void updateArticle(Article article) {
		try {
    		PreparedStatement preparedStatement = connection.prepareStatement(
    				"UPDATE article SET Texte=? WHERE Id_article = ?;");
    		preparedStatement.setString(1, article.getTexte());
    		preparedStatement.setInt(2, article.getId());
    		
    		int statut = preparedStatement.executeUpdate();
    	}catch (SQLException e) {
    		System.out.println(e);
    	}
		
	}

	public void deleteArticle(Article article) {
		try {
    		PreparedStatement preparedStatement = connection.prepareStatement(
    				"DELETE FROM article WHERE id = ?;");
    		preparedStatement.setInt(1, article.getId());
    		
    		int statut = preparedStatement.executeUpdate();
    	}catch (SQLException e) {
    		System.out.println(e);
    	}
		
	}
	
	public List<Article> getDecroissantArticles() {
		ArrayList<Article> articles = new ArrayList<Article>();
		try {
			String query = "SELECT * FROM article GROUP BY date DESC  LIMIT 0,2";
			PreparedStatement ps = connection.prepareStatement(query);
					
			ResultSet resultat = ps.executeQuery();
			while(resultat.next()) {
				Article a = new Article();
				a.setId(resultat.getInt("Id_article"));
				a.setTitre(resultat.getString("Titre"));
				a.setDescription(resultat.getString("Description"));
				a.setTexte(resultat.getString("Texte"));
				a.setAuteur(resultat.getString("Auteur"));
				a.setId_auteur(resultat.getInt("Id_auteur"));
				a.setDate(resultat.getString("Date"));
				articles.add(a);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return articles;
	}
	
	
}