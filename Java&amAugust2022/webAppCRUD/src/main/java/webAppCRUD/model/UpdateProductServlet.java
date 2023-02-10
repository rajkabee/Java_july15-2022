package webAppCRUD.model;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Product p = new ProductDao().getOne(id);
		request.setAttribute("product", p);
		request.getRequestDispatcher("updateProductForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product p = new Product(
				Integer.parseInt(request.getParameter("id")),
				request.getParameter("name"),
				request.getParameter("description"),
				request.getParameter("inStock").equalsIgnoreCase("true")?true:false,
				Float.parseFloat(request.getParameter("price"))
				);
		ProductDao pDao = new ProductDao();
		pDao.update(p);
		response.sendRedirect("products");

	}

}
