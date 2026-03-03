package com.coforge;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class CRUDMenu
{
	static HashSet<Bank> bankSet = new HashSet<Bank>();
	static
	{
		bankSet.add(new Bank(123, "Siva", 50000));
		bankSet.add(new Bank(124, "Mani", 60000));
		bankSet.add(new Bank(125, "Rahul", 70000));
		bankSet.add(new Bank(126, "Neha", 80000));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1- Create Account");
			System.out.println("2- Read Account Details");
			System.out.println("3- Update Account Details");
			System.out.println("4- Delete Account Details");
			System.out.println("5- Exit");
			System.out.println("Enter choice: ");
		    choice = sc.nextInt();
		    switch (choice) {
		    case 1: 
		    	createAccount(sc);
		    	break;
		    case 2:
		    	readAccount(sc);
		    	break;
		    case 3:
		    	updateAccount(sc);
		    	break;
		    case 4:
		    	deleteAccount(sc);
		    	break;
		    case 5:
		    	System.out.println("Exiting application.");
		    	break;
		    default:
		    	System.out.println("Invalid choice");
		    }
		} while(choice!=5);
		sc.close();
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("Enter account no.:");
		int accnum = sc.nextInt();
		System.out.println("Enter account holder name:");
		String name = sc.next();
		System.out.println("Enter bank balance:");
		Double bal = sc.nextDouble();
		Bank b = new Bank(accnum,name,bal);
		if(bankSet.add(b))
		{
			System.out.println("Account added");
		}
		else
		{
			System.out.println("account already exists");
		}
	}
	public static void readAccount(Scanner sc)
	{
		if(bankSet.isEmpty())
		{
			System.out.println("Account details not found");
		}
		else
		{
			System.out.println("Account Details");
			bankSet.forEach(e -> System.out.println(e));
		}
	}
	public static void updateAccount(Scanner sc)
	{
		System.out.println("Enter account number to update");
		int num = sc.nextInt();
		boolean exist = false;
		for(Bank bank: bankSet)
		{
			if(bank.getAccnum() == num)
			{
				System.out.println("Enter new name:");
				bank.setName(sc.next());
				System.out.println("Enter new balance:");
				bank.setBal(sc.nextDouble());
				System.out.println("Account details updated");
				exist = true;
				break;
			}
		}
		if(!exist)
		{
			System.out.println("Account not found");
		}
	}
	public static void deleteAccount(Scanner sc)
	{	
		System.out.println("Enter account number to delete:");
		int num = sc.nextInt();
		Iterator<Bank> itr = bankSet.iterator();
		boolean exist = false;
		while(itr.hasNext()) {
			Bank bank = itr.next();
			if(bank.getAccnum()==num) {
				itr.remove();
				System.out.println("Account deleted successfully");
				exist = true;
				break;
			}
		}
		if(!exist)
		{
			System.out.println("Account not found");
		}
	}
}