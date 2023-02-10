package com.example.hibernateIntro.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration()
			        			.configure("com/example/hibernateIntro/oneToMany/hbm.cfg.xml")
			        			.addAnnotatedClass(Employee.class)
			        			.addAnnotatedClass(Department.class);
        Employee sanjeep = new Employee("Sanjeep Lama", "Manager", 46765.56f, true);
        Employee nabin = new Employee("Nabin Pradhan", "Driver", 234433.22f, true);
        Department dept = new Department("accounts");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(sanjeep);
        employees.add(nabin);
        sanjeep.setDepartment(dept);
        nabin.setDepartment(dept);
        dept.setEmployees(employees);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(sanjeep);
        session.save(nabin);
        session.save(dept);
        //Employee e = session.find(Employee.class, 1);
        //System.out.println(e);
        tx.commit();
        session.close();
    	System.out.println( "Hello World!" );
    }
}
