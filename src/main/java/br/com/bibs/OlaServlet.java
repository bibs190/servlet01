package br.com.bibs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ola")
public class OlaServlet extends HttpServlet{
	
	@Override
	protected void  doGet(HttpServletRequest req, HttpServletResponse res){
		
		int p1 = Integer.parseInt(req.getParameter("p1"));
		int p2 = Integer.parseInt(req.getParameter("p2"));
		int total = p1 + p2;
		res.setContentType("text/html;charset=UTF-8");
		try{
		
			PrintWriter out = res.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\"/>");
			out.println("</head>");
			out.println("<body>");

			out.println("<h1>Total: " + total +  "</h1>");

			out.println("</body>");
			out.println("</html>");
		}
		catch(IOException e){
			
			
		}
	}
	
	
}