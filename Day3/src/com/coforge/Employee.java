package com.coforge;
public class Employee
{
	private String name;
	private int id;
	static String companyName = "Coforge";
	private double bSalary;
	public Employee()
	{
		super();
	}
	public Employee(String name, int id, double bSalary)
	{
		super();
		this.name = name;
		this.id = id;
		this.bSalary = bSalary;
		//this.companyName = companyName;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public static String getCompanyName()
	{
		return companyName;
	}
	public static void setCompanyName(String companyName)
	{
		Employee.companyName = companyName;
	}
	public double getbSalary()
	{
		return bSalary;
	}
	public void setbSalary(double bSalary)
	{
		this.bSalary = bSalary;
	}
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", id=" + id + ", bSalary=" + bSalary + "]";
	}
	public void calSalary()
	{
		double netSal;
		if(this.bSalary > 50000)
		{
			double hra = 0.10;
			double da = 0.10;
			netSal = bSalary + bSalary * hra + bSalary * da;
		}
		else
		{
			netSal = bSalary;
		}
		System.out.println("Net Salary:" + netSal);
	}
}