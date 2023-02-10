package firstWebApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class MyServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		//out.print("<h1>Hello from MyServlet!</h1>");
		String username = req.getParameter("username");
		//out.print("hello, "+username);
		req.setAttribute("name", username+" is a attribute");
		
		req.getRequestDispatcher("home.jsp").forward(req, res);
		
		
	}
}
