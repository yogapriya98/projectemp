package Employee_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Emp.java.Employee_entry;

@WebServlet(name="login",urlPatterns="/login_page")
public class Emp_Ser4 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		String password=req.getParameter("password");
	   
	    
	    Employee_entry emp=new Employee_entry();
		boolean s=emp.getLogin(userid,password);
		System.out.println(s);
		if(s==false) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/set_login.html");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/first.html");
			dispatcher.forward(req, resp);
		}
	}

}
