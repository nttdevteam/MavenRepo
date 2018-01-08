import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	methodsFile myClass = new methodsFile();
        int a= Integer.valueOf(request.getParameter("input_1"));
        int b=Integer.valueOf(request.getParameter("input_2"));
        if (request.getParameter("Addition")!= null) {
        	myClass.addition(a,b);
        } else if (request.getParameter("Subtraction")!= null) {
        	myClass.subtraction(a,b); 
        } else if (request.getParameter("Multiplication")!= null) {
        	myClass.multiplication(a,b);  
        } else if (request.getParameter("Division") != null) {
        	myClass.division(a,b);   
        }  
        request.setAttribute("result",myClass.c);
        request.setAttribute("a",a);
        request.setAttribute("b",b);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}





