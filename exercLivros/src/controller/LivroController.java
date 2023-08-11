package controller;

import java.util.LinkedList;


import model.LivroModel;

public class LivroController {
	private	LinkedList<LivroModel> listaLivros;
	private LivroModel livro;
	
	public LivroController(LivroModel livro) {
		this.livro = livro;
	}
	
	//Criação da Lista de Livros
	public LivroController() {
		listaLivros = new LinkedList<LivroModel>();
	}
	
	public void CadastrarLivro(LivroModel livro) {
		listaLivros.add(livro);
	}
	
	public void RemoverLivro(LivroModel livro) {
		for (LivroModel l : listaLivros) {
			if (l.getTitulo().equals(livro)) {
				listaLivros.remove();
				System.out.println("Livro removido");
			}else {
				System.out.println("Livro inexistente");
			}

		}
	}
}
