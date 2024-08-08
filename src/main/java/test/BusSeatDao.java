package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusSeatDao {
    private static final String INSERT_SEAT_SQL = "INSERT INTO bus_seats (seat_number) VALUES (?);";
    Connection con = null;
    public BusSeatDao() {}

    protected Connection getConnection() {
       
      
        	con=DBConnection.getCon();
       
        return con;
    }

    public void bookSeats(String[] seats) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SEAT_SQL)) {

            for (String seat : seats) {
                preparedStatement.setString(1, seat);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
   
    
}
