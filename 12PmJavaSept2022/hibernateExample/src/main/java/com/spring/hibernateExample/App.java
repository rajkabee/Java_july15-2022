package com.spring.hibernateExample;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration()
        						.configure("hbm.cfg.xml")
        						.addAnnotatedClass(User.class)
        						.addAnnotatedClass(Role.class);
    	System.out.println( "Hello World!" );
    	User user1 = new User("Ram", "pasword", true);
    	User user2 = new User("Shyam", "pasword", true);
    	Role role1 = new Role("admin");
    	Role role2 = new Role("user");
    	ArrayList<Role> roles = new ArrayList<Role>();
    	roles.add(role1);
    	roles.add(role2);
    	user1.setRoles(roles);
    	user2.setRoles(roles);
    	ArrayList<User> users = new ArrayList<User>();
    	users.add(user1);
    	users.add(user2);
    	role1.setUsers(users);
    	role2.setUsers(users);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(user1);
    	session.save(user2);
    	session.save(role1);
    	session.save(role2);
    	tx.commit();
    	session.close();
    	sf.close();
    	
    }
}
