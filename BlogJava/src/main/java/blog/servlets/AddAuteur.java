package blog.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOAuteur;
import blog.dao.DAOFactoryAuteur;
import blog.model.Auteur;

/**
 * Servlet implementation class AddAuteur
 */
public class AddAuteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/AddAuteur.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        
		String nom = req.getParameter("nom");
        String identifiant = req.getParameter("identifiant");
        String mdp = req.getParameter("mdp");

        DAOFactoryAuteur factory = new DAOFactoryAuteur();
        DAOAuteur daoAuteur = factory.getDaoAuteur();

        Auteur a = new Auteur();
        a.setIdentifiant(identifiant);
        a.setMdp(mdp);
        a.setNom(nom);;
        daoAuteur.addAuteur(a);

        this.getServletContext().getRequestDispatcher("/WEB-INF/AddAuteur.jsp").forward(req, resp);
	    }

}
