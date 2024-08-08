package test;

	import java.io.IOException;

	import java.sql.Date;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


		@WebServlet("/hotelbookingservlet")

		public class HotelBookingServlet extends HttpServlet {
			
			
		private static final long serialVersionUID = 1L;

			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			
		       long mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
		       System.out.println(mobilenumber);

		 Date checkin = Date.valueOf(request.getParameter("checkin")); 
		    Date checkout = Date.valueOf(request.getParameter("checkout"));
		       int adults = Integer.parseInt(request.getParameter("adults"));
		       System.out.println(adults);
		       int children = Integer.parseInt(request.getParameter("children"));
		       System.out.println(children);
		       int price=Integer.parseInt(request.getParameter("price"));
System.out.println(price);
	        response.setContentType("text/html");
		    response.getWriter();  

			Hotel ht=new Hotel();
			 ht.setFirstname(firstname);
			 ht.setLastname(lastname);
			 ht.setMobilenumber(mobilenumber);

			ht.setCheckin(checkin);
			ht.setCheckout(checkout);
			ht.setAdults(adults);
	         ht.setChildren(children);
	         ht.setPrice(price);

			int result=new HotelBookingDao().insert(ht);
			response.getWriter();
			if(result>0) {


						 
				RequestDispatcher rd = request.getRequestDispatcher("SearchHotel.html");
				 
				rd.include(request, response);

			}
			else {

				
				  RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	 
				  rd.include(request, response);
				 
			}
			   
			}
			}



