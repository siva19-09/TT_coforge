package com.coforge;
public class Square implements Shape
{
	private double side;
	public Square()
	{
		super();
	}
	public Square(double side)
	{
		super();
		this.side = side;
	}
	@Override
	public void area()
	{
		System.out.println(side * side);
	}
	@Override
	public void circumference()
	{
		System.out.println(4 * side);
	}
}