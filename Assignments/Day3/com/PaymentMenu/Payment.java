package com.coforge.PaymentMenu;
public abstract class Payment
{
	static int transactionCount = 0;
	abstract void pay(double amount);
	public final void generateReceipt(double amount)
	{
		transactionCount++;
		System.out.println("Payment Successful of Rs." + amount);
		System.out.println("Transaction ID: TXN" + transactionCount);
	}
}