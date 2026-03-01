package com.coforge;
public class PaymentMain
{
	public static void main(String[] args)
	{
		Card ob = new Card(12345678, 123, 4567, "12 / 09/ 2028");
		ob.pay();
		UPI ob1 = new UPI(5890, "hdfc", "gpay@12445");
		ob1.pay(4567);
		ob1.paymentReceipt();
		Wallet ob2 = new Wallet(12334356, 5280, "icici");
		ob2.pay(5280);
		ob2.PaymentReceipt();
	}
}