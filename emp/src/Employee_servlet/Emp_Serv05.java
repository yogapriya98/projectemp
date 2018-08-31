package Employee_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Emp.java.Employee_entry;

@WebServlet(name="login_set",urlPatterns="/set_login")
public class Emp_Serv05 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String  loginid=req.getParameter("setid");
	String logpass=req.getParameter("setpassword");
	System.out.println(logpass);
	Employee_entry emp=new Employee_entry();
	emp.setLogin(loginid,logpass);
	RequestDispatcher dispatcher=req.getRequestDispatcher("/first.html");
	dispatcher.forward(req, resp);
}
}
