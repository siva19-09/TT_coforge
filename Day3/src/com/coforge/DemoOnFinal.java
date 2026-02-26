package com.coforge;
public class DemoOnFinal // final classes can't be extended.
{
	protected final String name = "Siva";
	public final void printDetails() // final methods can't be overridden
	{
		System.out.println(this.name);
	}
	public static void main(String[] args)
	{
		DemoOnFinal dof = new DemoOnFinal();
		dof.printDetails();
		final double p1 = 3.14;
		//pi = 3.15;
	}
}