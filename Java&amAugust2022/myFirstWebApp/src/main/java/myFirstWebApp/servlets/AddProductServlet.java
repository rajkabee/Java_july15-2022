package myFirstWebApp.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public AddProductServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addProductForm.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String manufacturer = request.getParameter("manufacturer");
		String description = request.getParameter("description");
		Float price = Float.parseFloat(request.getParameter("price"));
		//response.getWriter().append(name+" "+manufacturer+" "+description+" "+price);
		request.setAttribute("productName", name);
		request.getRequestDispatcher("products.jsp").forward(request, response);
		
	}

}
