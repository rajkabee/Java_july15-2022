package webapp.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.entity.Product;
import webapp.util.HibernateUtil;
@WebServlet("/updateProduct")
public class UpdateProduct extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		HibernateUtil util = new HibernateUtil();
		Session session = util.getSessionFactory().openSession();
		Product pd = session.find(Product.class, id);
		req.setAttribute("product", pd);
		req.getRequestDispatcher("updateProduct.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product pd =  new Product();
		pd.setId(Integer.parseInt(req.getParameter("id")));
		pd.setName(req.getParameter("name"));
		pd.setQuantityInStock(Integer.parseInt(req.getParameter("quantityInStock")));
		pd.setUnitPrice(Float.parseFloat(req.getParameter("unitPrice")));
		//persist to database
		HibernateUtil util = new HibernateUtil();
		SessionFactory sf = util.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(pd);
		tx.commit();
		session.close();
		sf.close();
		resp.sendRedirect("products");
		
	}

}
