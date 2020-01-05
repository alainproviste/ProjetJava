package blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLManager {
	private Statement statement = null;
	private Connection connection = null;
	private String url = "jdbc:mysql://localhost:3306/blogjava?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private String utilisateur = "root";
	private String motDePasse = "";
	private static MySQLManager instance = null;
	
	private MySQLManager() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, utilisateur, motDePasse);
			this.statement = this.connection.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			//a gérer
		}
	}
	
	public static synchronized MySQLManager getInstance () {
		if (instance == null) {
			instance = new MySQLManager();
		}
		return instance;
	}
	
    public void select() {
        try {
            ResultSet resultat = statement.executeQuery(
                    "SELECT id, mail, password FROM user;");
            while (resultat.next()) {
                int id = resultat.getInt("id");
                String mail = resultat.getString("mail");
                String password = resultat.getString("password");
                System.out.println(id);
                System.out.println(mail);
                System.out.println(password);
            }
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
        if(connection != null) {
            try {
                connection.close();
            } catch(SQLException e) {
                // Ignore
            }
        }
    }

	public Connection getConnection() {
		return connection;
	}
}
