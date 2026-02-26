package com.coforge;
public class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Siva", 123, 70000);
		Employee e2 = new Employee("Abhay", 124, 40000);
		Employee e3 = new Employee("Kiriti", 125, 20000);
		Employee.companyName = "Coforge Technologies";
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		e1.calSalary();
		e2.calSalary();
		e3.calSalary();
	}
}