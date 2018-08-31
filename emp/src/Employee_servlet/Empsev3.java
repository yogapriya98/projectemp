package Employee_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="emp_agetwo",urlPatterns="/age_one")
public class Empsev3 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hai");
		RequestDispatcher dispatcher=req.getRequestDispatcher("/age.html");
		dispatcher.forward(req, resp);
		
	}

}
