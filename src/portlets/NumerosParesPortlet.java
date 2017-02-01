package portlets;

import java.io.IOException;
import java.util.List;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import modelo.negocio.Matematicas;

public class NumerosParesPortlet extends GenericPortlet{
	
	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		Matematicas matematicas = new Matematicas();
		List<Integer> listaNumerosPares = matematicas.calcularNumerosPares(0, 20);
		
		request.setAttribute("listaNumerosPares", listaNumerosPares);
		PortletRequestDispatcher prd = 
				getPortletContext()
				.getRequestDispatcher("/jsp/numerosPares_view.jsp");
		prd.include(request, response);
	}

}
