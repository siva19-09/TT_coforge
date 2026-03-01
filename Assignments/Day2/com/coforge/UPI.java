package com.coforge;
public class UPI extends Payment
{
	String upi_id;
	String bankname;
	public UPI(int amt, String upi_id, String bankname)
	{
		super(amt);
		this.upi_id = upi_id;
		this.bankname = bankname;
	}
	public void paymentReceipt()
	{
		System.out.println("----Payment receipt----");
		System.out.println("Upi id" + upi_id);
		System.out.println("bankName:" + bankname);
		System.out.println("Amount paid:");
	}
	@Override
	public void pay()
	{
		System.out.println("Payment of ₹" + amt + " completed");
	}
}