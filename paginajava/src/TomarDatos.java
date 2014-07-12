

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TomarDatos
 */
@WebServlet("/TomarDatos")
public class TomarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TomarDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida = response.getWriter();
		
		salida.println("<html>");
		salida.println("<head></head>");
		salida.println("<body>");
		
		salida.println("El usuario es:");
		String usuario = request.getParameter("usuario");
		salida.println(usuario);

		salida.print("Password");
		String password = request.getParameter("password");
		salida.print(password);
		
		
		salida.println("</body>");
		salida.println("</html>");
		
		
	}

}
