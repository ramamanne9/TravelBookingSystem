package test;

import java.sql.Connection;


import java.sql.PreparedStatement;

public class RegistrationDao {
static int k=0;
static Connection con= null;
	
public int insert(FlightReg fr) {
		
try{  
	
	con=DBConnection.getCon();
PreparedStatement ps;
ps = con.prepareStatement("INSERT INTO User1 (USERID, FIRSTNAME, LASTNAME, MOBILENUMBER, EMAIL, PASSWORD) VALUES (?, ?, ?, ?, ?, ?)");

ps.setInt(1, fr.getId());
ps.setString(2,fr.getFirstname());
ps.setString(3, fr.getLastname());
ps.setLong(4,fr.getMobilenumber() );
ps.setString(5, fr.getEmail());
ps.setString(6, fr.getPassword());


k= ps.executeUpdate();
			}

catch (Exception e){System.out.println(e);}
	return k;
}}


