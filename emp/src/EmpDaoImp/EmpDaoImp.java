package EmpDaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dbutil.Db;
import Emp.java.Emplyoee_details;
import Employee.EmpDao;

public  class EmpDaoImp implements EmpDao {
	@Override
	public ArrayList<Emplyoee_details> putDetails(List<String> emp) {
		String[] arr=new String[15];
		int i=0;
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		
		try {
			for(String s:emp) {
				arr[i]=s;
				System.out.println(s);
			    i++;
			}
				String sql="INSERT INTO employee(Name,age,dob,address,salary,email,phone) values(?,?,?,?,?,?,?)";
				connection=Db.getConnection();
				prepareStatement=connection.prepareStatement(sql);
				prepareStatement.setString(1,arr[0]);
				prepareStatement.setString(2,arr[1]);
				prepareStatement.setString(3,arr[2]);
				prepareStatement.setString(4,arr[3]);
				prepareStatement.setString(5,arr[4]);
				prepareStatement.setString(6,arr[5]);
				prepareStatement.setString(7,arr[6]);
				prepareStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Db.close(connection, prepareStatement, null);
		}
		return null;
	}
   @Override
	public String getAge(String age,List<String> name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			String sql="select * from employee where age=?";
			connection=Db.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, age);
			ResultSet resultset=preparedStatement.executeQuery();
		 while(resultset.next()) {
			 String s=resultset.getString("name");
			 name.add(s);
		 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Db.close(connection, preparedStatement, null);
		}
		return null;
	}
   
@Override
public boolean getLogin(String userid, String password) {
	Connection connection=null;
	String s="";
	boolean isTrue=false;
    PreparedStatement preparedStatement=null;
    try {
    	String sql="select *from login ";
    	connection=Db.getConnection();
    	preparedStatement=connection.prepareStatement(sql);
    	//preparedStatement.setString(1,userid);
    	//preparedStatement.setString(2,password);
    	ResultSet resultset=preparedStatement.executeQuery();
    	while(resultset.next()) {
    	String s1=resultset.getString("loginID");
    	String s2=resultset.getString("password");
    	if(s1.equals(userid)) {
    		
    		if(s2.equals(password))
    			isTrue=true;
    		
    	}else {
    		isTrue=false;
    	}
    	
    	}
    }catch(Exception e) {
    	e.printStackTrace();
    }finally {
    	Db.close(connection, preparedStatement,null);
    }
 
	return isTrue;
}
@Override
public String setLogin(String loginid, String pass) {
	//int id=Integer.parseInt(loginid);
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	try {
		String sql="insert into login(loginID,password) values(?,?)";
		connection=Db.getConnection();
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,loginid);
		preparedStatement.setString(2,pass);
		preparedStatement.executeUpdate();
		
	}catch(Exception e) {
    	e.printStackTrace();
    }finally {
    	Db.close(connection, preparedStatement,null);
    }
 
	return null;
}
	

}
