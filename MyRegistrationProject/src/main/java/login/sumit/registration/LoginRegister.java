package login.sumit.registration;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginRegister() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CustomerDAO cd=new CustomerDAOImpl();
		String userName=request.getParameter("username");
		String password=request.getParameter("password1");
		String submitType=request.getParameter("submit");
		Customer c=cd.getCustomer("userName","password");
		if(submitType.equals("login") && c!=null && c.getName()!=null) {
			request.setAttribute("message",c.getName());
			request.getRequestDispatcher("Welcome.jsp").forward(request, response);
			
		}else if(submitType.equals("register")) {
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertCustomer(c);
			request.setAttribute("successMessage","Registraton complete ,,, please login to continue");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Data not found, click on Register");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
