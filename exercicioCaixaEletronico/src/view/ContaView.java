package view;

import model.ContaModel;

public class ContaView {
	public void exibirConta(ContaModel conta) {
		System.out.println("====Conta Banc�ria====");
		System.out.println("Saldo:" + conta.getSaldo());
		System.out.println("======================");
	}
	public void consultarSaldo(ContaModel conta){
		System.out.println("Seu saldo �:" + conta.getSaldo());
	}
	public void exibirSaque(ContaModel conta) {
		System.out.println("Digite o valor que deseja realizar seu saque:");
	}
	public void exibirInvalidade() {
		System.out.println("Op��o invalida, Saque maior que o Saldo!");
	}
	public void exibirDeposito(ContaModel conta) {
		System.out.println("Digite o valor que deseja realizar seu deposito:");
	}
	
}
