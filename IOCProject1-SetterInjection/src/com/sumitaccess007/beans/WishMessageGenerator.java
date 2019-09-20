package com.sumitaccess007.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	public void setDate(Date date)
	{
		this.date=date;
	}
	
	// Business Method
	public String generateWishMessage(String name)
	{
		int hour = 0;
		hour = date.getHours();
		if (hour<=12)
			return "Good Morning : "+name;
		else if (hour<=16)
			return "Good Evening : "+name;
		else if (hour<=20)
			return "Good Evening : "+name;
		else
			return "Good Night :"+name;
	}
}
