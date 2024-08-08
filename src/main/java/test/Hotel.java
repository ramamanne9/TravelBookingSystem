package test;

import java.sql.Date;

public class Hotel
{
private String firstname;
private String lastname;
private long mobilenumber;
private Date checkin;
private Date checkout;
private int adults;
private int children;
private int price;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public Date getCheckin() {
	return checkin;
}
public void setCheckin(Date checkin) {
	this.checkin = checkin;
}
public Date getCheckout() {
	return checkout;
}
public void setCheckout(Date checkout) {
	this.checkout = checkout;
}
public int getAdults() {
	return adults;
}
public void setAdults(int adults) {
	this.adults = adults;
}
public int getChildren() {
	return children;
}
public void setChildren(int children) {
	this.children = children;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}




}
