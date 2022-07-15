package firstWebApp.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstWebApp.model.Product;
import firstWebApp.model.ProductDao;


@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("addProductForm.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product(
									request.getParameter("productName"),
									request.getParameter("brand"),
									request.getParameter("description"),
									Float.parseFloat(request.getParameter("price")),
									request.getParameter("isInStock")=="true"?true:false
								);
		ProductDao pDao = new ProductDao();
		try {
			pDao.save(product);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/firstWebApp/products");
	}

}
