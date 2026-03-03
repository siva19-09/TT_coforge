package com.coforge;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Bank
{
	private long accnum;
	private String name;
	private double bal;
}