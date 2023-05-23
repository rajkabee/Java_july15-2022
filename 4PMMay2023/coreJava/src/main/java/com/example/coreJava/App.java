package com.example.coreJava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	Person p = new Person();
    	p.setId(12);
    	p.setName("Raghu");
    	p.setAddress("Kathmandu");
    	p=new Person(123, "SAbina Khadka", "Lalitpur");
    	System.out.println(p.getName());
        System.out.println(p);
    }
}
