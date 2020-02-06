package Batch2.demo;

import java.util.Date;


public class Demo1
{
	int id;
	String productName;
	Double Price;
	Date dom;
	
	public Demo1(int id,String productName,Double price,Date dom)
	{
		this.id=id;
		this.productName=productName;
		this.Price=price;
		this.dom=dom;
		
	}
	
	public String toString()
	{
		return +id+" "+productName+" "+ Price +" "+dom+" ";
		
	}

}




