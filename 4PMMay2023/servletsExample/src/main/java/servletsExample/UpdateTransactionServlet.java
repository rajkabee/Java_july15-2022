package servletsExample;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/updateTransaction")
public class UpdateTransactionServlet extends HttpServlet {
	TransactionDao tDao = new TransactionDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Transaction td=null;
		try {
			td = tDao.getOne(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg="Transaction not found!";
		if(td!=null) {
			msg="UpdateTransaction";
			req.setAttribute("msg", msg);
			req.setAttribute("transaction", td);
		}
		//resp.sendRedirect("transactions");
		req.getRequestDispatcher("transactions.jsp").forward(req, resp);
		
		
		
	}

}
