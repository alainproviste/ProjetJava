package blog.dao;

import java.util.List;

import blog.model.Article;

public interface DAOArticle {
	public Article getArticle(int id);
	
	public List<Article> getAllArticles();
	
	public void addArticle(Article article);
	
	public void updateArticle(Article article);
	
	public void deleteArticle(Article article);
	
	public List<Article> getDecroissantArticles();
	
}
