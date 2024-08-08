package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

@WebServlet("/processpayment")
public class ProcessPaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cardNumber = request.getParameter("cardNumber");
        String expiryDate = request.getParameter("expiryDate");
        String cvv = request.getParameter("cvv");

        Payment payment = new Payment(name, cardNumber, expiryDate, cvv);

        PaymentDAO paymentDAO = new PaymentDAO();

        
        try {
            paymentDAO.savePayment(payment);
            request.setAttribute("msg", "payment succesful");
            RequestDispatcher rd = request.getRequestDispatcher("msg.jsp");
            rd.forward(request, response);

            } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("msg", "payment Failed");
            RequestDispatcher rd = request.getRequestDispatcher("msg.jsp");
            rd.forward(request, response);
           
        }
    }
}
