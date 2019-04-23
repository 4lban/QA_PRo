package com.qapro.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterMember
 */ 
@WebServlet("/RegisterMember")		// instead of configuration in web.xml
public class RegisterMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterMember() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("namee");
		String surname = request.getParameter("surnamee");
		System.out.println(name + " " + surname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		1st way to return data
		System.out.println("Request is a POST request");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String language = request.getParameter("language");
		String[] topics = request.getParameterValues("topics");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.append("<html>");
		printWriter.append("<body>");
		printWriter.write("Welcome " + name + " " + surname);
		printWriter.write("<br></br>");
		printWriter.write("You will write in " + language);
		printWriter.write("<br></br>");
		printWriter.write("You will write about ");
		for (String topic : topics) {
			printWriter.write(topic + " ");
		}
		printWriter.write("<br></br>");
		printWriter.write("Please ise this method only in case you respond to an AJAX request. <br></br>Otherwise it shows that you are so lazy to implement your ");
		printWriter.append("</body>");
		printWriter.append("</html>");
		
//		2nd way to return data
		/**
		 * Do whatever you want with request paraeter
		 * Write into a DB, a file etc...
		 */
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/registercompleted.jsp");
		rd.forward(request, response);
		
	}

}
