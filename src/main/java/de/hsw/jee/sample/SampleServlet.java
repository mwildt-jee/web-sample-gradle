package de.hsw.jee.sample;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		Writer out = response.getWriter();
		out.write("<html>");
		out.write("<head><title>Mein Sample Servlet></title></head>");
		out.write("<body>");
		out.write("<h1>Hallo Welt</h1>");
		out.write("<p>Ich bin ein einfaches Sample-Servlet</p>");
		out.write("</body>");
		out.write("</html>");
		out.flush();
	}
	
}
