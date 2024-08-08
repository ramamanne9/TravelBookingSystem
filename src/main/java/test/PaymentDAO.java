package test;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentDAO {
   
    public void savePayment(Payment payment) throws SQLException {
        String SQL = "INSERT INTO PAYMENT (NAME, CARDNUMBER, EXPIRYDATE, CVV) VALUES (?, ?, ?, ?)";
        
        try (Connection connection = DBConnection.getCon();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
             
            preparedStatement.setString(1, payment.getName());
            preparedStatement.setString(2, payment.getCardNumber());
            preparedStatement.setString(3, payment.getExpiryDate());
            preparedStatement.setString(4, payment.getCvv());
            
            preparedStatement.executeUpdate();
        }catch(Exception e){
        	e.getMessage();
        }
        
    

   
  
    }
}
