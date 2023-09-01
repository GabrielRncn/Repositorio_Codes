package view;

import java.util.List;

import model.PlanetaModel;

public class PlanetaView {
	public void exibirListaDePlaneta(List<PlanetaModel> listaDePlanetas) {
		System.out.println("------------Lista de Planetas---------");
		for(PlanetaModel planeta : listaDePlanetas) {
			System.out.println("Planeta:" + planeta.getNome());
		}
	}
	
	public void removerPlaneta(boolean planetaRemovido) {
        if (planetaRemovido) {
        	System.out.println("Planeta removido com sucesso!\n");
        } else {
        	System.out.println("Planeta não encontrado na lista.\n");
        }
    }
}
