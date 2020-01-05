package blog.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOArticle;
import blog.dao.DAOAuteur;
import blog.dao.DAOFactoryAuteur;
import blog.dao.DAOFactoryArticle;
import blog.model.Auteur;
import blog.model.Article;

/**
 * Servlet implementation class ListeAuteur
 */
public class ListeAuteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 	DAOFactoryAuteur factory = new DAOFactoryAuteur();
        DAOAuteur daoauteur = factory.getDaoAuteur();
        List<Auteur> auteurs = daoauteur.getAllAuteurs();
        req.setAttribute("auteur", auteurs);
        
        DAOFactoryArticle factory2 = new DAOFactoryArticle();
        DAOArticle daoarticle = factory2.getDaoArticle();
        List<Article> articles = daoarticle.getAllArticles();
        req.setAttribute("article", articles);

        this.getServletContext().getRequestDispatcher("/WEB-INF/ListeAuteur.jsp").forward(req, resp);
    }

}
