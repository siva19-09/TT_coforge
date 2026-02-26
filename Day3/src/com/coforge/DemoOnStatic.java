package com.coforge;
public class DemoOnStatic
{
//	static
//	{
//		System.out.println("my first static block");
//	}
//	static
//	{
//		System.out.println("my second static block");
//	}
	//private String name;
	private String comapnyName = "Coforge";
	public void printName(String name)
	{
		System.out.println(name);
		System.out.println(this.comapnyName);
	}
	public static void main(String[] args)
	{
		System.out.println("inside main");
		DemoOnStatic dos = new DemoOnStatic();
		dos.printName("siva");
		
		
	}
//	static
//	{
//		System.out.println("my third static block");
//	}
//	static
//	{
//		System.out.println("4th block");
//	}
}