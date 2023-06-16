package servletsExample;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
			req.setAttribute("transaction", td);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg="Transaction not found!";
		if(td!=null) {
			msg="updateTransaction";
			req.setAttribute("msg", msg);
		}
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
		//resp.sendRedirect("transactions");
		req.getRequestDispatcher("transactions.jsp").forward(req, resp);
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Transaction tx = new Transaction(
				Integer.parseInt(req.getParameter("id")),
				req.getParameter("sender"),
				req.getParameter("receiver"),
				Float.parseFloat(req.getParameter("amount"))
			);
	int i =0;
	try {
		i = tDao.update(tx);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String msg = "Transaction couldn't be updated to the database!";
	if (i == 1) {
		msg = "Transaction updated in the database!";
	}
	req.setAttribute("msg", msg);
	resp.sendRedirect("transactions");
	}

}
