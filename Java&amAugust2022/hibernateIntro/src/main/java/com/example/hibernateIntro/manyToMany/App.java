package com.example.hibernateIntro.manyToMany;

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
			        			.configure("com/example/hibernateIntro/manyToMany/hbm.cfg.xml")
			        			.addAnnotatedClass(Employee.class)
			        			.addAnnotatedClass(Department.class);
        Employee sanjeep = new Employee("Sanjeep Lama", "Manager", 46765.56f, true);
        Employee nabin = new Employee("Nabin Pradhan", "Driver", 234433.22f, true);
        Department accounts = new Department("Accounts");
        Department operation = new Department("Operation");
        List<Department> departments = new ArrayList<Department>();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(sanjeep);
        employees.add(nabin);
        departments.add(operation);
        departments.add(accounts);
        sanjeep.setDepartments(departments);
        nabin.setDepartments(departments);
        accounts.setEmployees(employees);
        operation.setEmployees(employees);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(sanjeep);
        session.save(nabin);
        session.save(accounts);
        session.save(operation);
        //Employee e = session.find(Employee.class, 1);
        //System.out.println(e);
        tx.commit();
        session.close();
    	System.out.println( "Hello World!" );
    }
}
