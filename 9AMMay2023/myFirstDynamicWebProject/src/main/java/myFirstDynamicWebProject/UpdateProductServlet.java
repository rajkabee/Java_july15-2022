package myFirstDynamicWebProject;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myFirstDynamicWebProject.ProductDb.Product;
import myFirstDynamicWebProject.ProductDb.ProductDao;


@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {
	ProductDao pDao = new ProductDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long id = Long.parseLong(req.getParameter("id"));
		try {
			Product pd = pDao.getOne(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
