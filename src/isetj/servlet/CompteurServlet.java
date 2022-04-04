package isetj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompteurServlet
 */
@WebServlet("/CompteurServlet")
public class CompteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private int compt ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	int compt = 0;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		 
	      compt++; 
	     
	      response.getWriter().println(
	         "<html>\n" +
	            "<head><title> Compteur  </title></head>\n" +
	        		 "<!-- CSS only -->\r\n"
	        		 + "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">"+
	            "<body >\n" +
	               "<h1> Actualisation du page: </h1>\n" +
	               "<h2>" + compt+ "</h2>\n" +
	               "<a href= \"CompteurServlet\" class= \"btn btn-warning text-center\" > Actualiser Cette Page</a>" +
	            "</body> " +
	        " </html>"
	      );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
