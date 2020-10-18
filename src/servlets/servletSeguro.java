package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Seguro;
import dominio.SeguroDao;

/**
 * Servlet implementation class servletSeguro
 */
@WebServlet("/servletSeguro")
public class servletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletSeguro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int filas=0;
		if(request.getParameter("btnAceptar")!=null)
		{
			System.out.println("Agregando Seguro");
//			// int id = Integer.parseInt(request.getParameter("txtDescripcion"));
			String Descripcion = request.getParameter("txtDescripcion");
			int TipoSeguro = Integer.parseInt(request.getParameter("lblTipoSeguro"));
			String CostoContratacion = request.getParameter("txtCostoContratacion");
			String CostoMaxContratacion = request.getParameter("txtCostoMaxAsegurado");
			Seguro seguro = new Seguro();
//			SeguroDao sdao = new SeguroDao();
			System.out.println(Descripcion);
			System.out.println(TipoSeguro);
			System.out.println(CostoContratacion);
			System.out.println(CostoMaxContratacion);
			
			seguro.setIdSeguro(100);
			seguro.setIdTipo(TipoSeguro);
			seguro.setDescripcion(Descripcion);
			seguro.setCostoContratacion(Float.parseFloat(CostoContratacion));
			seguro.setCostoMaximoAsegurado(Float.parseFloat(CostoMaxContratacion));
			
			//filas=sdao.agregarSeguro(seguro);
			
	
//			RequestDispatcher rd = request.getRequestDispatcher("/ejemplo2.jsp");
//			rd.forward(request, response);
		}
		

//		RequestDispatcher rd = request.getRequestDispatcher("/ejemplo3.jsp");
//		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/ejemplo3.jsp");
		rd.forward(request, response);	
	}

}
