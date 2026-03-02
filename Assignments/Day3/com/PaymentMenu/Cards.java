package com.coforge.PaymentMenu;
public class Cards extends Payment
{
	@Override
	void pay(double amount)
	{
		System.out.println("Processing cards payment...");
		generateReceipt(amount);
	}
	
}