package isetj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoffeeServlet
 */
@WebServlet("/CoffeeServlet")
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String radioselect = request.getParameter("radioselect");
		String textermarque = request.getParameter("textermarque");
		
		request.getParameter("texteremarque");
		
		response.getWriter().println("<html><head>");
		response.getWriter().println("<title>Coffee Shop</title></head>");
		response.getWriter().println("<body> <img src='coffee.png' border='0' height='200' width='200'>");
		response.getWriter().println("<p>Merci de nous avoir fait parvenir la remarque suivante concernant");
		response.getWriter().println("<b>"+radioselect+"</b>");
		response.getWriter().println("<p>"+textermarque);
		response.getWriter().println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
