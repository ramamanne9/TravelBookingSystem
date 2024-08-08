package test;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class LoginDao {
	static Connection con= null;

		static List<FlightReg> li;
		public static List<FlightReg> validate(String firstName, String password) {
			li= new ArrayList<FlightReg>();
			con=DBConnection.getCon();
			PreparedStatement ps;
			try{ 

			 ps = con.prepareStatement(  
			"select * from User1 where FIRSTNAME=? and PASSWORD=?");  
			ps.setString(1,firstName);  
			ps.setString(2,password); 
					      
			ResultSet rs=ps.executeQuery();  
			 
			if(rs.next()) {
				FlightReg fr=new FlightReg();
				
				fr.setId(rs.getInt(1));
				fr.setFirstname(rs.getString(2));
				fr.setLastname(rs.getString(3));
				fr.setMobilenumber(rs.getLong(4));
				fr.setEmail(rs.getString(5));

				fr.setPassword(rs.getString(6));
				
			      li.add(fr);
			}
			
			          
			}catch(Exception e){System.out.println(e);}  
			
			return li;
		}
}
		
				
			
		






