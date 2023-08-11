package model;

public class LivroModel {
	private String titulo;
	private String autor;
	private int qntdPaginas;
	
	//Constructor
	public LivroModel(String titulo, String autor, int qntdPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.qntdPaginas = qntdPaginas;
	}
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getQntdPaginas() {
		return qntdPaginas;
	}
	
}
