package test;
import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	@WebServlet("/flightreg")

public class RegistrationServlet extends HttpServlet {
	
		
			
		private static final long serialVersionUID = 1L;

			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			String firstName=request.getParameter("firstname");
			String lastName=request.getParameter("lastname");
		    Long mobileNumber=Long.parseLong(request.getParameter("mobilenumber"));
		    String email = request.getParameter("email");
		    String password = request.getParameter("password");
	        response.setContentType("text/html");
			FlightReg fr=new FlightReg();
			fr.setId(id);
			fr.setFirstname(firstName);
			fr.setLastname(lastName);
			fr.setMobilenumber(mobileNumber);
			fr.setEmail(email);
			fr.setPassword(password);
			int result=new RegistrationDao().insert(fr);
			PrintWriter pw=response.getWriter();
			if(result>0) {


						 
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				 
				 rd.include(request, response);

			}
			else {

				
				  RequestDispatcher rd = request.getRequestDispatcher("Registrationform.html");
	 
				  rd.include(request, response);
				 
			}
			   
			}
			}








