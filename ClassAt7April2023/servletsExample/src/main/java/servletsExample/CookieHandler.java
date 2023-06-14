package servletsExample;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieHandler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("username", request.getParameter("name"));
		System.out.println(request.getParameter("name"));
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	

}
