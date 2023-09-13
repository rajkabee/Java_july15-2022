package webapp.servlets;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.entity.Product;
import webapp.util.HibernateUtil;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Products page ");
		//request.setAttribute("message", "Hello, this is products page!");
		HibernateUtil util = new HibernateUtil();
		SessionFactory sf = util.getSessionFactory();
		Session session = sf.openSession();
		List<Product> products = session.createQuery("SELECT a FROM Product a", Product.class).getResultList(); 
		session.close();
		sf.close();
		request.setAttribute("products", products);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
