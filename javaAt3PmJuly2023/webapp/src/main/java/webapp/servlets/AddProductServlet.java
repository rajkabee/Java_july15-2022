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
@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("addProductForm.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product pd =  new Product();
		pd.setName(req.getParameter("name"));
		pd.setQuantityInStock(Integer.parseInt(req.getParameter("quantityInStock")));
		pd.setUnitPrice(Float.parseFloat(req.getParameter("unitPrice")));
		//persist to database
		HibernateUtil util = new HibernateUtil();
		SessionFactory sf = util.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd);
		tx.commit();
		session.close();
		sf.close();
		resp.sendRedirect("products");
		
	}

}
