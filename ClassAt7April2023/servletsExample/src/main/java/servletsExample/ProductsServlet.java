package servletsExample;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servletsExample.model.Product;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = Arrays.asList(new Product[] {
			new Product(1, "Apples", "China", 400f),	
			new Product(2, "Bananas", "India", 180f),	
			new Product(3, "Papayas", "Bhutan", 150f),	
			new Product(4, "Kiwi", "Bahgaladesh", 550f)
		});
		request.setAttribute("products", products);
		request.setAttribute("msg", "welcome to products page!");
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
