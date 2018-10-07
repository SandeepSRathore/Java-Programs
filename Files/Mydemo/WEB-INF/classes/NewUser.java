import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class NewUser extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    	boolean exist=false;
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String submit=req.getParameter("submit");
		String register=req.getParameter("Register");
		String home=req.getParameter("Home");
		
		String loginId=req.getParameter("loginid");
	    String password=req.getParameter("password");
	    String rePassword=req.getParameter("repassword");
	    String firstName=req.getParameter("firstname");
	   	String lastName=req.getParameter("lastname");
	   	String day=req.getParameter("day");
	    String month=req.getParameter("month");
	    String year=req.getParameter("year");
	    String date=day + "/" + month + "/" + year;
	    String gender=req.getParameter("gender");
          
        if(submit!=null)
        {
        	try
          	{
            	Class.forName("com.mysql.jdbc.Driver");
               	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emailsimulator","root","root");
               	Statement st=con.createStatement();
               	ResultSet rs=st.executeQuery("select loginid from userinfo");
               	while(rs.next())
               	{
                        if(rs.getString(1).equals(loginId))
                        exist=true; 
               	}
               if(exist==true)
               {
               			out.println("<html>");
               			out.println("<body background='backblue.gif'><font size='4' color='red'> Sorry!. An User with " + loginId +
                        " is already existing.Please Choose another login ID.");
                        out.println("<br><a href='index.html'>Back..</a>");
                        out.println("</font></body>");
                        out.println("</html>");   
               }
               if(exist==false)
           	   {        
	               PreparedStatement ps=con.prepareStatement("insert into userinfo values(?,?,?,?,?,?)");
	               ps.setString(1,loginId);
	               ps.setString(2,password);
	               ps.setString(3,firstName);
	               ps.setString(4,lastName);
	               ps.setString(5,date);
	               ps.setString(6,gender);
              	   int i=0;
              	   i=ps.executeUpdate();
               	   if(i>0)
               	   {
		               	out.println("register successfully press go to home page button to see mails");
		               	out.println("<html>");
		               	out.println("<body background='red'>");
		               	out.println("<form action='newuser'>");
		               	out.println("<font size='4' color='blue'>");
		               	out.println("<input type='submit' name='Home' value='Home'>");
		              	out.println("</font></form></body>");
		               	out.println("</html>");
               	   }
               	   else
               	   {
		               	out.println("Error! click back to register again");
		               	out.println("<html>");
		               	out.println("<body background='red'>");
		               	out.println("<form action='newuser'>");
		               	out.println("<font size='4' color='blue'>");
		               	out.println("<input type='submit' name='Register' value='Back'>");
		              	out.println("</font></form></body>");
		               	out.println("</html>");
	           	  }
	           }
          
          	
          }
          catch(Exception e)
          {
               out.println(e.toString());
          }
          }
          
          
          if(home!=null)
          {
          		out.println("<html>");
          		out.println("<body background='backblue.gif'>");
               		out.println("Welcome"+firstName);
                        
                        out.println("</body>");
                        out.println("</html>");   
          }
    	}
      
     public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
     {
        doGet(req,res);
     }

}

                      