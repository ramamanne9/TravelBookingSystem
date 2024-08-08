package test;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FlightDetailsDao {
	public ArrayList<FlightDetails> al= new ArrayList<FlightDetails>();
	public ArrayList<FlightDetails> select(String destination){
		try {
			Connection con=DBConnection.getCon();
			
		PreparedStatement ps = con.prepareStatement("SELECT * FROM AVAILFLIGHTS WHERE DESTINATION =?"); 
		 ps.setString(1, destination);
		ResultSet rs= ps.executeQuery();
			 while(rs.next()) {	
				 FlightDetails ftd= new FlightDetails();
			    	ftd.setDestination(rs.getString(1));
					ftd.setDate(rs.getDate(2));
					ftd.setPrice(rs.getInt(3));
					al.add(ftd);
			    }
		}
			 catch(Exception e){  
				   e.printStackTrace();
			 }
			 return al;
		}
	}
  
//ps.setString(1,ftd.getDestination() );


	



