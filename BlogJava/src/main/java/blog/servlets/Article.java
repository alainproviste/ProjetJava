package blog.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOArticle;
import blog.dao.DAOFactoryArticle;

/**
 * Servlet implementation class Article
 */
public class Article extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 	DAOFactoryArticle factory = new DAOFactoryArticle();
			DAOArticle daoArticle = factory.getDaoArticle();
			int id = Integer.parseInt(req.getParameter("id"));
	        
	        req.setAttribute("article", daoArticle.getArticle(id));

	        this.getServletContext().getRequestDispatcher("/WEB-INF/Article.jsp").forward(req, resp);
	    }

}
