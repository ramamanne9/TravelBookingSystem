package test;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/details")
public class FlightDetailsServlet extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		 
	   // response.setContentType("text/html");


	  HttpSession hs=req.getSession(false);
	 String destination=req.getParameter("destination");
	   // PrintWriter pw=response.getWriter();

  if(hs==null) {
    req.setAttribute("msg","flights not avialable......<br>");
    req.getRequestDispatcher("msg.jsp").forward(req, res);
  }
  else {
    ArrayList<FlightDetails> al=new FlightDetailsDao().select(destination);
    hs.setAttribute("alist",al);
    req.getRequestDispatcher("Details.jsp").forward(req, res);
   //pw.println("<html><head></head><body><a href=payment.jsp>proceed to Pay</a></body></html>");

  }
  }
}





