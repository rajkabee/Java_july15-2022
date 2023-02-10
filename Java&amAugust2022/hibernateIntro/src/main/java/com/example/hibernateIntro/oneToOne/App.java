package com.example.hibernateIntro.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration()
			        			.configure("com/example/hibernateIntro/oneToOne/hbm.cfg.xml")
			        			.addAnnotatedClass(Employee.class)
			        			.addAnnotatedClass(Department.class);
        //Employee emp = new Employee("Sanjeep Lama", "Manager", 46765.56f, true);
        //Department dept = new Department("accounts");
        //emp.setDepartment(dept);
        //dept.setEmployee(emp);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(emp);
        //session.save(dept);
        Employee e = session.find(Employee.class, 1);
        System.out.println(e);
        tx.commit();
        session.close();
    	System.out.println( "Hello World!" );
    }
}
