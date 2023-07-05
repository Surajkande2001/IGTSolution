package com;

import java.util.*;

import java.sql.*;
import java.sql.Connection;


abstract class A
{
	String name;
	int age;
	int salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	A()
	{
		try
		{	
		System.out.println("Enter the Name:");
		String fname=sc.next();

		System.out.println("Enter Age:");
		int age=sc.nextInt();		
		}	
	catch(Exception e)
			{
			System.out.println(e);
			}
		
	}
 	public void display()
	{	 
		System.out.println("\nNAME:"+name);	
 		System.out.println("AGE:" +age);
		System.out.println("SALARY:" +salary);	
		System.out.println("DESIGNATION:"+designation); 		
	}
	public abstract void riseSalary();
}
final class Clerk extends A{
	public Clerk(){
		salary=10000;
		designation="Clerk";
	}
	public void riseSalary(){
		salary=salary+5000;
		System.out.println("incremented Salary for clerk:"+salary);
		
		
	}
}
final class Programmer extends A{
	public Programmer(){
		salary=15000;
		designation="Programmer";
	}
	public void riseSalary(){
		salary=salary+10000;
		System.out.println("incremented Salary for Programmer:"+salary);
		
		
	}
}
final class Manager extends A{
	public Manager(){
		salary=20000;
		designation="Manager";
	}
	public void riseSalary(){
		salary=salary+15000;
		System.out.println("incremented Salary for Manager:"+salary);
		
		
	}
}



public class Demo1 {
	public static void main(String args[]) {
		
			int ch1=0,ch2=0;
			ArrayList<A> list=new ArrayList<A>();
			do{
			System.out.println("--------------------------------");
			System.out.println("1.creat");
			System.out.println("2.Display");
			System.out.println("3.RiseSalary");
			System.out.println("4.Exit");
			System.out.println("--------------------------------");
			System.out.println("Enter your Choice: ");
			Scanner sc1=new Scanner(System.in);	
		
	}

}
