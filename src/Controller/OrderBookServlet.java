package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OrderDAO;
import model.Order;



@WebServlet("/OrderBookServlet")
public class OrderBookServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Orderbookservlet");

		
		String userid =request.getParameter("userId");
		String bookid =request.getParameter("bookId");
		String quantity =request.getParameter("quantity");
		
		out.println("User_id="+ userid);
		out.println("Book_id="+ bookid);
		out.println("quantity="+ quantity);
		
		int userid1 = Integer.parseInt(userid);
		int bookid1 = Integer.parseInt(bookid);
		int quantity1 = Integer.parseInt(quantity);
		
		  OrderDAO orderDAO =new OrderDAO();
			
			Order order = new Order();
			order.setId(userid1);
			order.setBookid(bookid1);
			order.setQuantity(quantity1);
	        out.println(order);

	        
	        try {
				orderDAO.register(order);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        
	        response.sendRedirect("orderbook.jsp");
	    
	        
	        
	        
	
	}

}
