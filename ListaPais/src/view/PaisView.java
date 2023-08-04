package view;

import java.util.List;

import model.Pais;

public class PaisView {
	public void exibirListaDePaises(List<Pais> paises) {
		System.out.println("Lista de Paises");
		
		for(Pais pais : paises) {
			System.out.println("País:" + pais.getNome() + "- Capital:" + pais.getCapital());
		}
	}
	
	public void exibirRemover(String nome) {
		System.out.println("Removendo...");
		System.out.println("Pais: " + nome + " Removido com sucesso!");
	}
}
