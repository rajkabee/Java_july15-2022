package com.example.swingPractice.jTableExamples1.tableModel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TableModelExample {
	public static void main(String[] args) {
		ArrayList<Product> products = getProducts();
		System.out.println(products);
		String[] cols = {"Id", "Name", "Description", "Unit Price", "Stock", "Is Availabel"};
		MyTableModel tableModel = new MyTableModel(cols, products);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		JFrame f = new JFrame("Default Table Model Example");
		f.add(scrollPane);
		f.pack();
		f.setVisible(true);
		
	}
	
	
	
	public static ArrayList<Product> getProducts(){
		Configuration con = new Configuration().configure().addAnnotatedClass(Product.class);
		Session session = con.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		ArrayList<Product> products = new ArrayList<Product>();
		products = (ArrayList<Product>)session.createQuery("SELECT a FROM Product a", Product.class).getResultList();
		tx.commit();
		session.close();
		return products;
	}
}


