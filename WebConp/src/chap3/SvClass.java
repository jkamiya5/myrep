package chap3;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvClass extends HttpServlet {
	private String directory;
	private String image;

	public void init() {
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		directory = context.getInitParameter("p1");
		image = config.getInitParameter("p2");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServerException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<BR>" + "directory" + directory + "<BR>");
		out.println("<BR>" + "image" + image + "<BR>");

	}

}
