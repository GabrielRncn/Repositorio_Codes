package controller;

import java.util.List;

import dao.PlanetaDAO;
import model.PlanetaModel;
import view.PlanetaView;

public class PlanetaController {
	private PlanetaView planetaView;
	private PlanetaDAO planetaDAO;
	
	public PlanetaController(){
		planetaDAO = new PlanetaDAO();
		planetaView = new PlanetaView();
	}
	
	//Metodo para adicionar Planeta dentro da lista
	public void adicionarListaPlanetas(String nome) {
		PlanetaModel planeta = new PlanetaModel(nome);
		planetaDAO.addPlaneta(planeta);
	}
	
	//Metodo para remover Planeta dentro da lista
	public void removerListaPlanetas(String nome) {
		boolean planetaRemovido = false;
		for (PlanetaModel planeta : planetaDAO.getListaDePlanetas()) {
			if(planeta.getNome().equalsIgnoreCase(nome)) {
				planetaDAO.removerPlaneta(planeta);
				planetaRemovido = true;
				planetaView.removerPlaneta(planetaRemovido);
				break;
			}
			
		}
	}
	
	//Metodo exibir lista de Planetas
	public void exibirListaDePaises() {
        List<PlanetaModel> listaDePlanetas = planetaDAO.getListaDePlanetas();
        planetaView.exibirListaDePlaneta(listaDePlanetas);
    }
}
