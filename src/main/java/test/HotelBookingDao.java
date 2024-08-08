package test;

	import java.sql.Connection;



	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	public class HotelBookingDao {
		
	    static int k=0;
		static Connection con= null;

	    public int insert(Hotel ht) {
				
	    try{ 
	    	
	    	con=DBConnection.getCon();
	PreparedStatement ps;
		 ps = con.prepareStatement("INSERT INTO HOTELS VALUES(?,?,?,?,?,?,?,?)");
	     		

	    ps.setString(1,ht.getFirstname());
	    ps.setString(2,ht.getLastname());
	    ps.setLong(3,ht.getMobilenumber());

		ps.setDate(4,ht.getCheckin());
		ps.setDate(5,ht.getCheckout());
		ps.setInt(6,ht.getAdults());
		ps.setInt(7,ht.getChildren());
		ps.setInt(8,ht.getPrice());


	    k= ps.executeUpdate();
					}
	    
	   catch (Exception e){System.out.println(e);}
	    	return k;
	    }}

