package blog.servlets;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.dao.DAOArticle;
import blog.dao.DAOFactoryArticle;
import blog.model.Article;

/**
 * Servlet implementation class ListeArticle
 */
public class ListeArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 	DAOFactoryArticle factory = new DAOFactoryArticle();
	        DAOArticle daoarticle = factory.getDaoArticle();
	        List<Article> articles = daoarticle.getAllArticles();
	        
	        
	        req.setAttribute("article", articles);

	        this.getServletContext().getRequestDispatcher("/WEB-INF/ListeArticle.jsp").forward(req, resp);
	    }
	    
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       /* DAOFactoryArticle factory = new DAOFactoryArticle();
	        DAOArticle daoarticle = factory.getDaoArticle();
	        
	        String selectid = req.getParameter("Id_article");
	        System.out.println(selectid);
	        int id = Integer.parseInt(selectid);
	        
	        Article a = new Article();
	        a.setId(id);
	        daoarticle.deleteArticle(a);
	        

	        this.getServletContext().getRequestDispatcher("/WEB-INF/ListeArticle.jsp").forward(req, resp);*/
	    }


	}


