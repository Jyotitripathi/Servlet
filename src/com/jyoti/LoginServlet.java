package com.jyoti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("--init executed--");
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("--destroy executed--");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("--service executed--");
		
		PrintWriter out = response.getWriter();
		String str= "<h3>Dear User, Login Here</h3>"+
				"<br/><br/>"+
				"<form action='LoginServlet' method='post'>"+
				"	Enter Email ID: <input type='text' name='txtEmail' placeholder='eg: john@example.com'>"+
				"	<br/>"+
				"	Enter Password: <input type='password' name='txtPassword' placeholder='eg: john@123'>"+
				"	<br/>"+
				"	<input type='submit' value='Login'>"+
				"</form>";
		
		String email = request.getParameter("txtEmail");
		String Password= request.getParameter("txtPassword");
		
		System.out.println("email:+email");
		System.out.println("password:+password");
		
	  if(email.equals("admin@example.com") && Password.equals("password123")) {
		 out.println("Login Success....");
		
	}
	else {
		out.println("Login Failure");
		out.print(str);
		
	}

}
}

