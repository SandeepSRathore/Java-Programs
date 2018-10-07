import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ComposeServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		try
        {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emailsimulator","root","root");
       		res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			
			HttpSession session=req.getSession(false);
			if(session!=null)
			{
				String to=req.getParameter("to");
				String subject=req.getParameter("subject");
				String content=req.getParameter("content");
				String send=req.getParameter("send");
				String save=req.getParameter("save");
				String name=(String)session.getAttribute("name");
				if(send!=null)
	        	{
	        		try
	        		{
	        		PreparedStatement ps=con.prepareStatement("insert into mail values(?,?,?,?,?)");
	        		ps.setString(1,null);
	        		ps.setString(2,name);
	        		ps.setString(3,to);
	        		ps.setString(4,subject);
	        		ps.setString(5,content);
	        		ps.executeUpdate();
	        		out.println("message has been sent");
	        		}catch(Exception e){e.printStackTrace();}
	        	}
	        	if(save!=null)
	        	{
	        		try
	        		{
	        		PreparedStatement ps=con.prepareStatement("insert into draft values(?,?,?,?,?)");
	        		ps.setString(1,null);
	        		ps.setString(2,name);
	        		ps.setString(3,to);
	        		ps.setString(4,subject);
	        		ps.setString(5,content);
	        		ps.executeUpdate();
	        		out.println("message has been saved");
	        		}catch(Exception e){e.printStackTrace();}
	        	}
			}
			else
			res.sendRedirect("index.html");
        }
        catch(Exception e){e.printStackTrace();}	
	}
}
