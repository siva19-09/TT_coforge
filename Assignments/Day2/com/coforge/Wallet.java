package com.coforge;
public class Wallet extends Payment
{
	long number;
	String bankname;
	public Wallet(int amt, long number, String bankname)
	{
		super(amt);
		this.number = number;
		this.bankname = bankname;
	}
	public void PaymentReceipt()
	{
		System.out.println("----Payment receipt----");
		System.out.println("phone number" + number);
		System.out.println("bankName:" + bankname);
		System.out.println("amount paid" + amt);
	}
	@Override
	public void pay()
	{
		System.out.println("Payment of ₹" + amt + " completed");
	}
}