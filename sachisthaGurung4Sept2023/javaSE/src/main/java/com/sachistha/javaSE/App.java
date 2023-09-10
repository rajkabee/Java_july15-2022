package com.sachistha.javaSE;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        emp.id=123;
        emp.name="Sachistha Gurung";
        emp.address="Chandol";
        
        Department dept = new Department();
        dept.deptId=321;
        dept.deptName="Accounts";
        dept.deptEmail="accounts@company.com";
        
        emp.dept= dept;
    }
}
