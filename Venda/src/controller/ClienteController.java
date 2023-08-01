package controller;

import java.util.Date;

import model.Cliente;
import model.Pedido;
import model.Produto;
import view.ClienteView;

public class ClienteController {
	    private ClienteView clienteView;

	    public ClienteController() {
	        clienteView = new ClienteView();
	    }
	    
	    public Cliente criarCliente( int idCliente, char nome, char email){
	    	Cliente cliente = new Cliente( idCliente,  nome,  email);
	    	return cliente;
	    	
	    }
	

	    public void exibirDetalhesCliente(Cliente cliente) {
	        clienteView.exibirCliente(cliente);
	    }
	}


