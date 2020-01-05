package blog.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOArticle;
import blog.dao.DAOFactoryArticle;
import blog.model.Article;


public class AddArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/AddArticle.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        
		String auteur = req.getParameter("auteur");
        String titre = req.getParameter("titre");
        String description = req.getParameter("description");
        String texte = req.getParameter("texte");

        DAOFactoryArticle factory = new DAOFactoryArticle();
        DAOArticle daoArticle = factory.getDaoArticle();

        Article a = new Article();
        a.setTitre(titre);
        a.setTexte(texte);
        a.setDescription(description);
        a.setAuteur(auteur);
        a.setId_auteur(1);
        daoArticle.addArticle(a);

        this.getServletContext().getRequestDispatcher("/WEB-INF/AddArticle.jsp").forward(req, resp);
	    }
}
