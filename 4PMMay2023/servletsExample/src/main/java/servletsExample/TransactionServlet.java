package servletsExample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/transactions")
public class TransactionServlet extends HttpServlet{
	TransactionDao tDao = new TransactionDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Transaction> txs;
		try {
			txs = tDao.getAll();
			req.setAttribute("transactions", txs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("msg", req.getParameter("msg"));
		req.getRequestDispatcher("transactions.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Transaction tx = new Transaction(
					req.getParameter("sender"),
					req.getParameter("receiver"),
					Float.parseFloat(req.getParameter("amount"))
				);
		int i =0;
		try {
			i = tDao.save(tx);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg="Transaction couldn't be added to the database!";
		if(i==1) {
			msg = "Transaction added to the database!";
		}
		req.setAttribute("msg", msg);
		resp.sendRedirect("transactions");
	}
}
