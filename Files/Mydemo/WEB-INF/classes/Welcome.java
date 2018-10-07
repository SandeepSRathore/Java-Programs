import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewUser extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		String firstName=req.getParameter("firstname");
		out.println("Welcome"+firstName);
		
    }
}


