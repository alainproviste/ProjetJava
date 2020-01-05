package blog.dao;

public class DAOFactoryAuteur {
	private MySQLManager manager;
	private DAOAuteur daoAuteur;
	public DAOFactoryAuteur() {
		manager = MySQLManager.getInstance();
		daoAuteur = new DAOAuteurImpl(manager.getConnection());
	}
	public DAOAuteur getDaoAuteur() {
		return daoAuteur;
	}
}