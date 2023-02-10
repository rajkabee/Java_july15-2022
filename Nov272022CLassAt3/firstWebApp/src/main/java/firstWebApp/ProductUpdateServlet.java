package firstWebApp;

import java.io.IOException;
import java.util.stream.Collectors;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		int id = Integer.parseInt(request.getParameter("id"));
		Product p = (Product)ProductServlet.products.stream()
											.filter(product->product.getId()==id)
											.limit(1)
											.collect(Collectors.toList())
											.get(0);
		System.out.println(p);
		request.setAttribute("product", p);
		request.getRequestDispatcher("../productUpdateForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product(
				Integer.parseInt(request.getParameter("id")), 
				request.getParameter("name"), 
				request.getParameter("manufacturer"),
				Float.parseFloat(request.getParameter("price"))
			);
		System.out.println(product);
		ProductServlet.products.forEach(p->{
			if(p.getId()==product.getId()) {
				p=product;
				ProductServlet.products.remove(ProductServlet.products.indexOf(p));
				ProductServlet.products.add(product);
			}
		});;
		ProductServlet.products.add(product);
		response.sendRedirect("../products");
	}

}
