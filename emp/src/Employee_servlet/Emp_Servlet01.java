package Employee_servlet;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Emp.java.Employee_entry;

@WebServlet(name="emp",urlPatterns="/serv_one")
public class Emp_Servlet01 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out=resp.getWriter();
			System.out.println("servlet");
			String e_name=req.getParameter("name");
			String e_age=req.getParameter("age");
			String e_dob=req.getParameter("dob");
			String e_address=req.getParameter("adderss");
			String e_salary=req.getParameter("salary");
			String e_email=req.getParameter("email");
			String e_phone=req.getParameter("phone");
			//int age=Integer.parseInt(e_age);
			//int phone=Integer.parseInt(e_phone);
			ArrayList<String> employee=new ArrayList<String>();
			employee.add(e_name);
			employee.add(e_age);
			employee.add(e_dob);
			employee.add(e_address);
			employee.add(e_salary);
			employee.add(e_email);
			employee.add(e_phone);
			
			Employee_entry emp=new Employee_entry();
			emp.getInput(employee);
			RequestDispatcher dispatcher=req.getRequestDispatcher("/conform.jsp");
			dispatcher.forward(req, resp);
			
			
	}

}
