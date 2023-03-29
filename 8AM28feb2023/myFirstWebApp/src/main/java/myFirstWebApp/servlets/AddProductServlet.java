package myFirstWebApp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myFirstWebApp.entity.Product;

import java.io.IOException;

public class AddProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addProductForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product pd = new Product(
								request.getParameter("name"),
								request.getParameter("manufacturer"),
								request.getParameter("active").equalsIgnoreCase("true")?true:false
								);
		System.out.println(pd);
		response.sendRedirect("products");
	}

}
