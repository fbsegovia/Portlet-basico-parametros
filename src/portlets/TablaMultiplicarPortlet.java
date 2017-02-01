package portlets;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class TablaMultiplicarPortlet extends GenericPortlet{

	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		String siguientePagina = request.getParameter("siguientePagina"); 
		if(siguientePagina == null){
			PortletRequestDispatcher prd = 
				getPortletContext().
				getRequestDispatcher("/jsp/introducirNumero_view.jsp");
			prd.include(request, response);			
		}else if(siguientePagina.equals("resultadoTablaNumero_view.jsp")){
			String sNumero = request.getParameter("numero");
			Integer iNumero = Integer.parseInt(sNumero);
			request.setAttribute("numero", iNumero);
			PortletRequestDispatcher prd = 
					getPortletContext().
					getRequestDispatcher("/jsp/" + siguientePagina);
				prd.include(request, response);
		}
		
		
	}
	//Por este metodo van a entrar todas las peticiones que nos lleguen
	//de la vista
	@Override
	public void processAction(ActionRequest request, 
							  ActionResponse response) throws PortletException, IOException {
		String accion = request.getParameter("accion");
		if(accion == null){
			return;
		}
		
		String siguientePagina = null;
		switch (accion) {
		case "Calcular":
			String numero = request.getParameter("numero");
			siguientePagina = "resultadoTablaNumero_view.jsp";
			//Para añadir el parametro numero a la RenderRequest
			//del doView, debemos hacer esto
			response.setRenderParameter("numero", numero);
			break;

		default:
			break;
		}
		response.setRenderParameter("siguientePagina", siguientePagina);
	}
}
