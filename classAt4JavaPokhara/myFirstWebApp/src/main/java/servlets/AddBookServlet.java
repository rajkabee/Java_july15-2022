package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Book;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("bookForm.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book book = new Book(Integer.parseInt((String) request.getParameter("isbn")),
							(String)request.getParameter("title"),
							(String)request.getParameter("author")
				);
		System.out.println("hello");
		response.getWriter().append("ISBN: "+book.getIsbn()+"title: "+book.getTitle()+"author:"+book.getAuthor());
	}

}
