package model;

public class Pais {
	private String nome;
	private String capital;
	
	public Pais(String nome, String capital) {
		this.nome = nome;
		this.capital = capital;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
}
