package myFirstDynamicWebProject;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myFirstDynamicWebProject.ProductDb.ProductDao;

@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
	ProductDao pDao = new ProductDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		int i=0;
		try {
			i = pDao.delete(Long.parseLong(request.getParameter("id")));
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = "Product delete failed!";
		if(i==1) {
			msg = "Product deleted successfully!";
		}
		request.setAttribute("msg", msg);
		response.sendRedirect("products");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
