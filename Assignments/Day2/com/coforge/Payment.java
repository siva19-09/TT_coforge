package com.coforge;
public abstract class Payment
{
	int amt;
	public Payment(int amt)
	{
		this.amt = amt;
	}
	public abstract void pay();
	public void pay(int amt)
	{
		// TODO Auto-generated method stub
	}
}