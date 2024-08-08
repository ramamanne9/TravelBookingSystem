<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        a {
            text-decoration: none; 
            color: black; 
        }
        
        a:visited {
            color: black; 
        }
        
        .flight-detail {
            margin-bottom: 10px; 
        }
    </style>
</head>
<body>
     <% 
     
     ArrayList<FlightDetails> al=(ArrayList)session.getAttribute("alist");
     if(al.size()==0){
    	 out.println("tickets not available....<br>");
     }
     else{
         Iterator<FlightDetails> it=al.iterator();
         while(it.hasNext()) {
        	 FlightDetails fs=(FlightDetails)it.next();    
        	  out.println("<div class='flight-detail'>"+"<a href='payment.jsp'>"+fs.getDestination()+"&nbsp&nbsp"+fs.getPrice()+"&nbsp&nbsp"+fs.getDate()+"&nbsp&nbsp"+"</a>"+ "</div>");
             }
     }
     
   
     %>
</body>
</html>
