package test;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightBookingDao {
	
	static  int  k=0;
	static Connection con= null;
			
    public static int insert(Flight ft) {
			
    	con=DBConnection.getCon();
PreparedStatement ps;
try {
	ps = con.prepareStatement("INSERT INTO FLIGHTS(FIRSTNAME,LASTNAME,MOBILENUMBER,STARTING, DESTINATION,DEPARTUREDATE,RETURNINGDATE,ADULTS,CHILDREN,CLASS,WAY)VALUES(?,?,?,?,?,?,?,?,?,?,?)");


	 ps.setString(1,ft.getFirstname());
		ps.setString(2, ft.getLastname());
		ps.setLong(3,ft.getMobilenumber() );
		ps.setString(4,ft.getFrom());
		ps.setString(5,ft.getTo());
		ps.setDate(6,ft.getDeparture());
		ps.setDate(7,ft.getReturning());
		ps.setInt(8,ft.getAdults());
		ps.setInt(9,ft.getChildren());
		ps.setString(10,ft.getClasstype());
		ps.setString(11,ft.getWay());


	    k= ps.executeUpdate();
			
		
		


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return k;

    }  		

   }
   
  
    	
    	
    
   
    
    

	

	


