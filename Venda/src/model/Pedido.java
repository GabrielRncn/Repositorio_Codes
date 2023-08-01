package model;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private	Cliente cliente;
	private	Produto produto;
	private	int quantidade;
	private Date data;

	//Constructor
	public Pedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
	}

	//Getters and Setters
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void criarPedido( int idPedido, Cliente cliente, Produto produto, int quantidade, Date data ) {
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", produto=" + produto + ", quantidade" + quantidade + ", data=" + data + "]";
	}
	


}
