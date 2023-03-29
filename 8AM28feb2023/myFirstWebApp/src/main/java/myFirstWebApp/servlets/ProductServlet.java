package myFirstWebApp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myFirstWebApp.entity.Product;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/myProducts")
public class ProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product pd1 = new Product(1, "55 inch Smart Television", "MI", true);
		Product pd2 = new Product(2, "Home Theater Sound System", "Sony", true);
		Product pd3 = new Product(3, "Vacuum Cleaner", "LG", true);
		ArrayList<Product> products = new ArrayList<>();
		products.add(pd1);
		products.add(pd2);
		products.add(pd3);
		request.setAttribute("products", products);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
