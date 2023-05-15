package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Book;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	static List<Book> books =  (Arrays.asList(new Book[] {
			new Book(1, "Romeo And Juliet", "Shakespear"),
			new Book(2, "Harry Potter", "J K Rowling"),
			new Book(3, "Notebook", "Shakespear"),
			new Book(4, "Alchemist", "Paulo Coelho")
			
	}));
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//	response.getWriter().write("<h1>Page Header for Home Servlet</h1>");
	//	request.getRequestDispatcher("home.html").forward(request, response);
		String msg = "Welcome to my first Web Application!";
		request.setAttribute("message", msg);
		request.setAttribute("books", books);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
