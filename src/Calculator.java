import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet 

{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        int a1= Integer.parseInt(request.getParameter("num1"));
        int a2= Integer.parseInt(request.getParameter("num2"));
        String opt = request.getParameter("opr");
        if(opt == "+")
        {
            out.println("<h1>Addition</h1>"+(a1+a2));
        }
        if(opt == "-")
        {
            out.println("<h1>Substraction</h1>"+(a1-a2));
        }
        if(opt == "*")
        {
            out.println("<h1>Multiplication</h1>"+(a1*a2));
        }if(opt == "/")
        {
            out.println("<h1>Division</h1>"+(a1/a2));
        }
        }
        catch(Exception e)
        {

        }
        
        
        
    }
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
	PrintWriter out = response.getWriter();
	//out.println(�hello�);
	String n1 = request.getParameter("a");
	String n2 = request.getParameter("b");
	String opt = request.getParameter("op");
	if(opt.equals("p"))
	out.println(Integer.parseInt(n1) + Integer.parseInt(n2));
	else if(opt.equals("m"))
	out.println(Integer.parseInt(n1) - Integer.parseInt(n2));
	}

	}

