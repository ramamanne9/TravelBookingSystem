package test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/busseatservlet")
public class BusSeatsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String selectedSeats = request.getParameter("selectedSeats");

        if (selectedSeats != null && !selectedSeats.isEmpty()) {
            String[] seats = selectedSeats.split(",");

            StringBuilder confirmationMessage = new StringBuilder("Seat Confirmation:<br>");
            for (String seat : seats) {
                confirmationMessage.append("Booked seat: ").append(seat).append("<br>");
            }

            request.getSession().setAttribute("confirmationMessage", confirmationMessage.toString());
            request.getSession().setAttribute("selectedSeats", selectedSeats);

            response.sendRedirect(request.getContextPath() + "/processpayment");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Error: No seats selected.");
            out.close();
        }
    }
}
