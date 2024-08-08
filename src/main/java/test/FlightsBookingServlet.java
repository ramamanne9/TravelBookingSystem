package test;


import java.io.IOException;

import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/flightbooking")

	public class FlightsBookingServlet extends HttpServlet {
		
		
		
		
	private static final long serialVersionUID = 1L;

	
	
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		long mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));

	    String from = request.getParameter("from");
	    String to = request.getParameter("to");
	    Date departure = Date.valueOf(request.getParameter("departure")); 
	    Date returning = Date.valueOf(request.getParameter("returning")); 
	       int adults = Integer.parseInt(request.getParameter("adults"));
	       int children = Integer.parseInt(request.getParameter("children"));
	     String classtype =request.getParameter("classtype");
	     String way= request.getParameter("way");

	   

		Flight ft=new Flight();
		 ft.setFirstname(firstName);
		ft.setLastname(lastName);
		ft.setMobilenumber(mobilenumber);
		ft.setFrom(from);
		ft.setTo(to);
		ft.setDeparture(departure);
		ft.setDeparture(returning);
		ft.setAdults(adults);
         ft.setChildren(children);
         ft.setClasstype(classtype);
         ft.setWay(way);
		int result=FlightBookingDao.insert(ft);
		
		System.out.println(result);
		if(result>0) {


		//request.setAttribute("destination", to);
		RequestDispatcher rd = request.getRequestDispatcher("ViewDetails.html");
			 
			rd.include(request, response);

		}
		else {

			
			  RequestDispatcher rd = request.getRequestDispatcher("Login.html");
 
			  rd.include(request, response);
			 
		}
		   
		}
		}
	
		