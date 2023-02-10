package webapp.servlets;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webapp.model.Product;
import webapp.model.ProductDao;
@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("productForm.jsp").forward(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Product product = new Product(
					req.getParameter("name"),
					req.getParameter("manufacturer"),
					req.getParameter("description"),
					Float.parseFloat(req.getParameter("price")),
					Boolean.parseBoolean(req.getParameter("isAvailable"))
				);
		ProductDao pDao = new ProductDao();
		try {
			pDao.save(product);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.sendRedirect("products");
	}
}
