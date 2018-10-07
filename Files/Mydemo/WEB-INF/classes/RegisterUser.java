import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class RegisterUser extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    	PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String loginId=req.getParameter("loginid");
	    String password=req.getParameter("password");
	    String firstName=req.getParameter("firstname");
	    String login=req.getParameter("login");
	    String s1="";
	    String s2="";
	    String s3="";
	    if(login!=null)
        {
        	try
          	{
            	Class.forName("com.mysql.jdbc.Driver");
               	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emailsimulator","root","root");
               	PreparedStatement ps=con.prepareStatement("select * from userinfo where loginid=?");
               	ps.setString(1,loginId);
               	ResultSet rs=ps.executeQuery();
               	while(rs.next())
               	{
               		s1=rs.getString(1);
               		s2=rs.getString(2);
               		s3=rs.getString(3);
               	}
               		if(s1.equals(loginId) && s2.equals(password))
               		{
               			out.println("login successfully"+"\n");
               			out.print("Welcome "+s3);  
               			HttpSession session=req.getSession();
               			session.setAttribute("name",loginId);
               			out.println("<a href='home'>Click Here to check mails</a>");	
               			out.close();
               		}
               		else
               		{
               			res.sendRedirect("index.html");
               			
               		}
               	}
               		
          	
          catch(Exception e)
          {
               out.println(e.toString());
          }
        }
    }
    
    
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
     {
        doGet(req,res);
     }

}
