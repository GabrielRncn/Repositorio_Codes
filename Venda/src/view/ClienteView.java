package view;

import model.Cliente;

public class ClienteView {
	public void exibirCliente(Cliente cliente) {
        System.out.println("==== Detalhes do Pedido ====");
        System.out.println("ID: " + cliente.getidCliente());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email:" + cliente.getEmail());
        System.out.println("--------------------");
    }
}

