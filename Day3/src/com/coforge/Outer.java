package com.coforge;
public class Outer
{
	static String name;
	public static void printDetails()
	{
		//this.name = "Siva";
		//System.out.println("Name:" + this.name);
	}
	static class Inner
	{
		private String innerName;
		public void printDetailsOfInnerName()
		{
			this.innerName = "Amit";
			System.out.println(innerName);
		}
	}
	public static void main(String[] args)
	{
//		Outer out = new Outer();
//		out.printDetails();
//		Outer.Inner in = new Outer().new Inner();
//		in.printDetailsOfInnerName();
		Outer.name = "Siva";
		Outer.printDetails();
		Inner inner = new Inner();
		inner.printDetailsOfInnerName();
	}
}