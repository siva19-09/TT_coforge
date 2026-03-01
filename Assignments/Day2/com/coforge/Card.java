package com.coforge;
public class Card extends Payment
{
	long card_no;
	int cvv;
	String exp_date;
	public Card(int amt, long card_no, int cvv, String exp_date)
	{
		super(amt);
		this.card_no = card_no;
		this.cvv = cvv;
		this.exp_date = exp_date;
	}
	@Override
	public void pay()
	{
		System.out.println("payment completed");
	}
}