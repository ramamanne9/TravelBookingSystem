package test;

import java.sql.Date;
import java.io.*;

public class FlightDetails implements Serializable{
	private String destination;
	private Date date;
	private int price;
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void Date(Date date) {
		// TODO Auto-generated method stub
		
	}

}
