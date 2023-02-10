package webAppCRUD.model;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("addProductForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Product p = new Product(
					0,
					request.getParameter("name"),
					request.getParameter("description"),
					request.getParameter("inStock").equalsIgnoreCase("true")?true:false,
					Float.parseFloat(request.getParameter("price"))
					);
			ProductDao pDao = new ProductDao();
			pDao.save(p);
			response.getWriter().append("Product saved to the database");
	}

}
