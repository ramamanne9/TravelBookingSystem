package test;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
    String f=request.getParameter("firstname");  
	    String p=request.getParameter("password");  
	         
	    
	        new LoginDao();
			ArrayList<FlightReg> li=(ArrayList<FlightReg>) LoginDao.validate(f, p);
	        if(li.size()==0) {
	        	out.print("Sorry Wrong username or password ...Try Again");
	        	
		        RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
		        rd.include(request,response);  
	        	
	        }
	        else{ 
	        	for(int i=0;i<li.size();i++) {
		    
		    	out.println("login successfull");
		    	out.println("<html><head></head><body><h1>Login Successfull.....</body></html>");
		    	out.println("<html><head></head><body><h1>Go To HomePgage.....<a href=home.html>search for services</a></body></html>");

		    	
		}
	        	
	        }    	

	}
	}

	    
		 
	        
	     
	





