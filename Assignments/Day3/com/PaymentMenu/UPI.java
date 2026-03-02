package com.coforge.PaymentMenu;
public class UPI extends Payment
{
	@Override
	void pay(double amount)
	{
		System.out.println("Processing UPI payment...");
		generateReceipt(amount);	
	}
}