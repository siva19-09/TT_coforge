package com.coforge.PaymentMenu;
public class NetBanking extends Payment
{
	@Override
	void pay(double amount)
	{
		System.out.println("Processing Net Banking...");
		generateReceipt(amount);	
	}
}