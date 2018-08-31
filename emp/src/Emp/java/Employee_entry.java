package Emp.java;

import java.util.List;

import EmpDaoImp.EmpDaoImp;
//import EmpDaoImp.EmpDaoImp_age;
import Employee.EmpDao;

public class Employee_entry {
	EmpDao employee;
	
	public Employee_entry() {
		employee=new EmpDaoImp();
		
	}
	public List<Emplyoee_details> getInput(List<String> emp_entry){
		
		return employee.putDetails(emp_entry);
		
	}
	public String getAge(String age,List<String> name) {
		return employee.getAge(age,name);
	}
	public boolean getLogin(String userid,String password) {
	 boolean s1=(boolean) employee.getLogin(userid,password);
	 return s1;
		
	}
   public String setLogin(String loginid,String pass) {
	   return employee.setLogin(loginid,pass);
   }
	
}
