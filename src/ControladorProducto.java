
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorProducto
 */
@WebServlet("/ControladorProducto")
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList <Producto>productos= new ArrayList<>();
		
		Producto p= new Producto("pasta"," Gluten free","http://www.cateringsanpablo.net/noticias/wp-content/uploads/2015/09/pasta.jpg");
		productos.add(p);
		
		Producto p1= new Producto("carne","Carne roja", "http://resumendigital.com/wp-content/uploads/2016/01/carne.jpg");	
		productos.add(p1);
		
		Producto p2= new Producto("pescado"," AZul","http://www.webconsultas.com/sites/default/files/styles/encabezado_articulo/public/migrated/comprar-pescado.jpg?itok=M6UhoJGD");
		productos.add(p2);
		
		
		Producto p3= new Producto("chocolate"," Sugar free","http://tudosisdiaria.com/wp-content/uploads/2013/01/chocolate-1.jpg");
		productos.add(p3);		
		
		
		Producto p4= new Producto("bebidas"," Sin gas","https://s2.yimg.com/bt/api/res/1.2/hSmwBoaIUEMPfio1c0n67w--/YXBwaWQ9eW5ld3NfbGVnbztxPTg1/http://media.zenfs.com/es-ES/blogs/fineconomiaparatodoses/distintos-tipos-de-bebidas.jpg");
		productos.add(p4);
		
		Producto p5= new Producto("pan"," Gluten free","http://www.al-pan.com/media/productos/especiales.jpg");
		productos.add(p5);
		
		String producto = request.getParameter("producto");
		
		int num_entero=Integer.parseInt(producto);
		
		
		request.setAttribute("name",productos.get(num_entero).getName());
		request.setAttribute("description",productos.get(num_entero).getDescription());
		request.setAttribute("img",productos.get(num_entero).getImg());
		
		
		
		
		request.getRequestDispatcher("pages/detalle.jsp").forward(request, response);
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
