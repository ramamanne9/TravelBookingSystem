package test;

import java.sql.Date;

public class Bus {
private String name;
private long mobileNumber;
private int noOfPassengers;
private String source;
private String destination;
private  Date date;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
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


}