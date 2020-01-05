package blog.dao;

public class DAOFactoryArticle {
	private MySQLManager manager;
	private DAOArticle daoArticle;
	public DAOFactoryArticle() {
		manager = MySQLManager.getInstance();
		daoArticle = new DAOArticleImpl(manager.getConnection());
	}
	public DAOArticle getDaoArticle() {
		return daoArticle;
	}
}
