import java.io.IOException;
import java.net.HttpCookie;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/profile")
public class TestServlet extends HttpServlet{
	//String name = "My First Web App";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		PrintWriter out = resp.getWriter();
		out.write("<h1>"+name+"</h1>");
		*/
		HttpSession session = req.getSession();
		ArrayList<String> names=(ArrayList<String>)session.getAttribute("names");
		if(names==null) {
			names = new ArrayList<>();
		}
		System.out.println(req.getParameter("name"));
		if(req.getParameter("name")!=null) {
			names.add(req.getParameter("name"));
		}
		session.setAttribute("names", names);
		//req.setAttribute("name", this.name);
		req.setAttribute("names", names);
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//this.name=req.getParameter("name");
		System.out.println(req.getParameter("name"));
		doGet(req, resp);
		//resp.getWriter().println(req.getAttribute("name"));
	}
}
