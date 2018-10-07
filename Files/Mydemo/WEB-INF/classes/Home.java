import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Home extends HttpServlet
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
		
			String name=(String)session.getAttribute("name");
			String inbox=req.getParameter("inbox");
			String outbox=req.getParameter("outbox");
			String draft=req.getParameter("draft");
			String sent=req.getParameter("sent");
			String trash=req.getParameter("trash");
			String compose=req.getParameter("compose");
			
			
			
			out.println("<html><body>");
			out.println("<form action='home'>");
			out.println("<div id='container' style='width:1300px; height:700px;'>");
			out.println("<div id='header' style='background-color:#FFA500; height:100px;width:300px;float:left;'>");
			out.println("<input type='submit' name='compose' value='Compose' style='margin:25px; padding:5px;' ></div>");
			out.println("<div id='btnpanel' style='background-color:#FFA500;height:100px;width:1000px;float:left;'>");
			
			out.println("<input type='submit' name='receiveall' value='ReceiveAll' style='margin:15px 20px; padding:5px;'>");
			out.println("<input type='submit' name='forward' value='Forward' style='margin:15px 20px; padding:5px;'>");
			out.println("<input type='submit' name='delete' value='Delete' style='margin:15px 20px; padding:5px;'>");
			out.println("<input type='submit' name='deleteall' value='DeleteAll' style='margin:15px 20px; padding:5px;'>");
			out.println("<input type='submit' name='restore' value='Restore' style='margin:15px 20px; padding:5px;'>");
			out.println("<input type='submit' name='restoreall' value='RestoreAll' style='margin:15px 20px; padding:5px;'></div>");
			out.println("<div id='menu' style='background-color:#FFD700;height:600px;width:100px;float:left;'>");
			out.println("<b>Cobined View</b><br>");
			out.println("<input type='submit' name='inbox' value='Inbox' style='padding:5px; margin:25px;'/><br>");
			out.println("<input type='submit' name='outbox' value='Outbox' style='padding:5px; margin:25px;'/><br>");
			out.println("<input type='submit' name='draft' value='Draft' style='padding:5px; margin:25px;'/><br>");
			out.println("<input type='submit' name='sent' value='Sent' style='padding:5px; margin:25px;'/><br>");
			out.println("<input type='submit' name='trash' value='Trash' style='padding:5px; margin:25px;'/></div>");
			
			if(compose!=null)
			{
				res.sendRedirect("compose.html");
			}
			
			
			if(trash!=null)
			{
				out.println("<div id='content' style='background-color:#EEEEEE;height:200px;width:400px;float:left;'>");
				out.println("<table border='2'>");
				out.println("<tr>");
				out.println("<th>From</th>");
				out.println("<th>Subject</th>");
				out.println("<th>Content</th>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</div>");
			}
			else if(outbox!=null)
			{
				try{
				PreparedStatement ps=con.prepareStatement("select * from mail where from1=?");
				ps.setString(1,name);
               	ResultSet rs=ps.executeQuery();
               	String s1="";
	    		String s2="";
	    		String s3="";
               	while(rs.next())
               	{
               		s1=rs.getString(3);
               		s2=rs.getString(4);
               		s3=rs.getString(5);
               	}
				out.println("<div id='content' style='background-color:#EEEEEE;height:200px;width:400px;float:left;'>");
				out.println("<table border='2'>");
				out.println("<tr>");
				out.println("<th> From </th>");
				out.println("<th> Subject </th>");
				out.println("<th> Content </th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>"+s1+"<td>");
				out.println("<td>"+s2+"</td>");
				out.println("<td>"+s3+"</td>");
				out.println("</tr>");
				
				out.println("</table>");
				out.println("</div>");
				}catch(Exception e){e.printStackTrace();}
			}
			else if(draft!=null)
			{
				try{
				PreparedStatement ps=con.prepareStatement("select * from draft where from1=?");
				ps.setString(1,name);
               	ResultSet rs=ps.executeQuery();
               	String s1="";
	    		String s2="";
	    		String s3="";
	    		out.println("<div id='content' style='background-color:#EEEEEE;height:600px;width:1200px;float:left;'>");
				out.println("<table border='2' width='1200px'>");
				out.println("<tr>");
				out.println("<th>   </th>");
				out.println("<th> To </th>");
				out.println("<th> Subject </th>");
				out.println("<th> Content </th>");
				out.println("</tr>");
               	while(rs.next())
               	{
               		s1=rs.getString("to1");
               		s2=rs.getString("subject1");
               		s3=rs.getString("message");
               		out.println("<tr>");
               		out.println("<td><input type='checkbox' name='chk'></td>");
					out.println("<td>"+s1+"</td>");
					out.println("<td>"+s2+"</td>");
					out.println("<td>"+s3+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</div>");
				}catch(Exception e){e.printStackTrace();}
			}
			 else if(sent!=null)
			{
				try{
				PreparedStatement ps=con.prepareStatement("select * from mail where from1=?");
				ps.setString(1,name);
               	ResultSet rs=ps.executeQuery();
               	String s1="";
	    		String s2="";
	    		String s3="";
	    		out.println("<div id='content' style='background-color:#EEEEEE;height:600px;width:1200px;float:left;'>");
				out.println("<table border='2' width='1200px'>");
				out.println("<tr>");
				out.println("<th> </th>");
				out.println("<th> To </th>");
				out.println("<th> Subject </th>");
				out.println("<th> Content </th>");
				out.println("</tr>");
               	while(rs.next())
               	{
               		s1=rs.getString("to1");
               		s2=rs.getString("subject1");
               		s3=rs.getString("message");
               		out.println("<tr>");
               		out.println("<td><input type='checkbox' name='chk'></td>");
					out.println("<td>"+s1+"</td>");
					out.println("<td>"+s2+"</td>");
					out.println("<td>"+s3+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</div>");
				}catch(Exception e){e.printStackTrace();}
			}
			else
			{
				try{
				PreparedStatement ps=con.prepareStatement("select * from mail where to1=?");
				ps.setString(1,name);
               	ResultSet rs=ps.executeQuery();
               	String s1="";
	    		String s2="";
	    		String s3="";
	    		out.println("<div id='content' style='background-color:#EEEEEE;height:600px;width:1200px;float:left;'>");
				out.println("<table border='2' width='1200px'>");
				out.println("<tr>");
				out.println("<th> </th>");
				out.println("<th> From </th>");
				out.println("<th> Subject </th>");
				out.println("<th> Content </th>");
				out.println("</tr>");
               	while(rs.next())
               	{
               		//System.out.println("Hello "+1);
               		s1=rs.getString("from1");
               		s2=rs.getString("subject1");
               		s3=rs.getString("message");
               		
               		//out.println("<a href='forward?from="+s1+"subject="+s2+"message="+s3+"'>");
               		out.println("<a href='#'>");
               		out.println("<tr>");
               		out.println("<td><input type='checkbox' name='chk' id=''></td>");
					out.println("<td>"+s1+"</td>");
					out.println("<td>"+s2+"</td>");
					out.println("<td>"+s3+"</td>");
					out.println("</tr></a>");
				}
				out.println("</table>");
				out.println("</div>");
				}catch(Exception e){e.printStackTrace();}
			}
			out.println("</div>");
			out.println("</form>");
			out.println("</body></html>");
			out.close();
		}
		else
			res.sendRedirect("index.html");
	}
	catch(Exception e){e.printStackTrace();}
	}
}

