package test;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class TransportationDao {
	
   static int k=0;
	static Connection con= null;

    public int insert(Bus bs) {
			
    try{  
    	
    	con=DBConnection.getCon();
PreparedStatement ps;	
     
      ps = con.prepareStatement("INSERT INTO TRANSPORTS(NAME,MOBILENUMBER,SOURCE,DESTINATION,DAY,PASSENGERS) VALUES(?,?,?,?,?,?)");
    
    ps.setString(1,bs.getName());
    ps.setLong(2,bs.getMobileNumber());
    ps.setString(3,bs.getSource());
    ps.setString(4,bs.getDestination());
	ps.setDate(5,bs.getDate());
	ps.setInt(6,bs.getNoOfPassengers());


    k= ps.executeUpdate();
				}
    
   catch (Exception e){System.out.println(e);}
    	return k;
    }}

