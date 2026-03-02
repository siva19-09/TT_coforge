package com.coforge.PaymentMenu;
import java.util.Scanner;
public class PaymentMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		double amount;
		do
		{
			System.out.println("Payment Menu");
			System.out.println("1.Wallet");
			System.out.println("2.Card");
			System.out.println("3.UPI");
			System.out.println("4.Net Banking");
			System.out.println("5.Exit");
			System.out.println("Emter your choice: ");
			choice = sc.nextInt();
			if(choice >= 1 && choice <= 4)
			{
				System.out.println("Enter Amount: ");
				amount = sc.nextDouble();
			}
			switch(choice)
			{
			case 1:
				Payment w = new Wallets();
				amount = sc.nextDouble();
				w.pay(amount);
				break;
			case 2:
				Payment c = new Cards();
				amount = sc.nextDouble();
				c.pay(amount);
				break;
			case 3:
				Payment u = new UPI();
				amount = sc.nextDouble();
				u.pay(amount);
				break;
			case 4:
				Payment n = new NetBanking();
				amount = sc.nextDouble();
				n.pay(amount);
				break;
			case 5:
				System.out.println("Exiting payment system");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		while(choice != 5);
		sc.close();
	}
}