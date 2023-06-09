package servletsExample;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionHandler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item = request.getParameter("item");
		HttpSession session = request.getSession();
		ArrayList<String> items = (ArrayList<String>) session.getAttribute("items");
		if(items==null) {
			items = new ArrayList<String>();
		}
		items.add(item);
		session.setAttribute("items", items);
		request.setAttribute("items", items);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
