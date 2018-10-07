import javax.servlet;
import javax.servlet.http;
import java.net.*;
public class FirstServlet 
{
	public static void main(String args[])
	{
		String name,city;
		Cookie arr[];
		arr = request.getCookies();
	
		if(arr==null)
		{
			Cookie c1 = new Cookie("Visitor", "Saral");
			c1.setMaxAge(60*60*24*30);
			response.addCookie(c1);
			
			Cookie c2 = new Cookie("Place", "Jaipur");
			c2.setMaxAge(60*60*24*30);
			response.addCookie(c2);
			
			out.println("welcome to my site");
		}
		else
		{
			for(int i=0; i<arr.length; i++)
				if(arr[i].getName().equals("Visitor"))
					name= arr[i].getValue();
					else
						if(arr[i].getName().equals("Place"))
							city= arr[i].getValue();
							
							out.println("Hello "+name+ " from "+city+" U r welcome back");
		}
	}
}