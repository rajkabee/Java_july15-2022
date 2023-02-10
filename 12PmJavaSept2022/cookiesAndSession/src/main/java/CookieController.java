

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/myServlet")
public class CookieController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("name", "Pravin");
		cookie1.setMaxAge(600);
		response.addCookie(cookie1);

		request.getRequestDispatcher("cookiePage.jsp").forward(request, response);;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1 = new Cookie(request.getParameter("name"), request.getParameter("value"));
		cookie1.setMaxAge(600);
		response.addCookie(cookie1);
		doGet(request, response);
	}

}
