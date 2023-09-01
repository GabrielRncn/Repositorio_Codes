package dao;

import java.util.ArrayList;
import java.util.List;

import model.PlanetaModel;

public class PlanetaDAO {
	private List<PlanetaModel>listaDePlanetas;

	public PlanetaDAO() {
		listaDePlanetas = new ArrayList<>();
	}
	
	//Criar a lista de planetas
	public void addPlaneta(PlanetaModel planeta) {
		listaDePlanetas.add(planeta);
	}
	
	//Remover planeta da lista
	public void removerPlaneta(PlanetaModel planeta) {
		listaDePlanetas.remove(planeta);
	}
	
	//Metodo para retornar a lista
	public List<PlanetaModel> getListaDePlanetas(){
		return listaDePlanetas;
	}
}
