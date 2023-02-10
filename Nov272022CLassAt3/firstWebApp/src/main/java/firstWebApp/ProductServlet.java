package firstWebApp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ProductServlet extends HttpServlet {
	static List<Product> products;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String[] reqType=request.getPathInfo().split("/");
//		System.out.println(reqType[1]);
//		if(reqType[1].equalsIgnoreCase("showAll")) {
//			request.getRequestDispatcher("products.jsp").forward(request, response);
//		}
		products = Arrays.asList(
					new Product(1, "Trousers", "Levis", 2300f),
					new Product(2, "Shirt", "Gucci", 4500f),
					new Product(3, "Shoes", "Jordan", 5300f),
					new Product(4, "Belt", "Louis Vuitton", 2500f),
					new Product(5, "Jacket", "Mamut", 6700f)	
				);
		request.setAttribute("products", products);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
