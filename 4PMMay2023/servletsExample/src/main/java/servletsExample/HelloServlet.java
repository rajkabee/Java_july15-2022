package servletsExample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		
		PrintWriter out = resp.getWriter();
		out.print("Welcome to my first Web Servlet! your sum: "+(a+b));
	}
}
