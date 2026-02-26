package com.coforge;
import java.util.Scanner;
public class ShapesMain
{
	public static void main(String[] args)
	{
		Shape sh;
		String type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shape type Circle / Square");
		type = sc.next();
		if(type.equals("Circle"))
		{
			System.out.println("Enter radius ");
			double r = sc.nextDouble();
			sh = new Circle(r);
			sh.area();
			sh.circumference();
		}
		else if(type.equals("Square"))
		{
			System.out.println("Enter side");
			double s = sc.nextDouble();
			sh = new Square(s);
			sh.area();
			sh.circumference();
		}
		else
		{
			System.out.println("Invalid shape");
		}
		sc.close();
//		Circle c = new Circle(7);
//		c.area();
//		c.circumference();
//		Square s = new Square(5);
//		s.area();
//		s.circumference();
//		Shape sh = new Circle(6);
//		sh.area();
//		sh.circumference();
//		sh = new Square(4);
//		sh.area();
//		sh.circumference();
	}
}