package blog.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOArticle;
import blog.dao.DAOFactoryArticle;
import blog.model.Article;

/**
 * Servlet implementation class Index
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 	DAOFactoryArticle factory = new DAOFactoryArticle();
        DAOArticle daoarticle = factory.getDaoArticle();
        List<Article> articles = daoarticle.getDecroissantArticles();
        
        
        req.setAttribute("article", articles);

        this.getServletContext().getRequestDispatcher("/WEB-INF/ListeArticle.jsp").forward(req, resp);
    }

}
