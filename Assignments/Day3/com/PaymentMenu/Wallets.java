package com.coforge.PaymentMenu;
public class Wallets extends Payment
{
	@Override
	void pay(double amount)
	{
		System.out.println("Processing wallet payment...");
		generateReceipt(amount);
	}
}