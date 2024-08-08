package test;

import java.io.IOException;



import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	@WebServlet("/busbooking")

public class TransportationServlet extends HttpServlet {
	
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name=request.getParameter("name");
        long mobileNumber=Long.parseLong(request.getParameter("mobileNumber"));
        String source=request.getParameter("source");
	    String destination=request.getParameter("destination");
        Date date = Date.valueOf(request.getParameter("date")); 
	    int noOfPassengers = Integer.parseInt(request.getParameter("noOfPassengers"));

        response.setContentType("text/html");
	    response.getWriter();  

		Bus bs=new Bus();
		bs.setName(name);
        bs.setMobileNumber(mobileNumber);
		bs.setSource(source);
		bs.setDestination(destination);
		bs.setDate(date);
		bs.setNoOfPassengers(noOfPassengers);
		int result=new TransportationDao().insert(bs);
		response.getWriter();
		if(result>0) {


		//pw.println("<html><head></head><body><h1>Student registered SEARCH FOR FLIGHT</h1><br><a Search.jsp>Login</a></body></html>");
					 
			RequestDispatcher rd = request.getRequestDispatcher("BusSeats.html");
			 
			rd.include(request, response);

		}
		else {

			
			  RequestDispatcher rd = request.getRequestDispatcher("Login.html");
 
			  rd.include(request, response);
		} 
		}
		   
		}

		
		
		


	