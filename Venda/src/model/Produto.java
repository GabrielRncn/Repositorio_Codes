package model;

public class Produto {
	private int idProduto;
	private char nome;
	private double preco;
	
	//Constructor
	public Produto(int idProduto, char nome, double preco) {
		//super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
	}

	//Getters and Setters
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto +", nome=" + nome + "preco=" + preco + "]";
	}
}
