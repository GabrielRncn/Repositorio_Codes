package controller;

import model.ContaModel;
import view.ContaView;

public class CaixaEletronicoController {
	private ContaModel conta = new ContaModel(23);
	private ContaView contaView = new ContaView();

	public void ConsultarSaldo() {
		contaView.exibirConta(conta);
	}
	
	public void Sacar(double sacar) {
		if (conta.getSaldo() >= sacar) {
			conta.setSaldo(conta.getSaldo() - sacar);
			contaView.exibirConta(conta);;
		} else {
			contaView.exibirInvalidade();
		}
	}

	public void exibirSaque() {
		contaView.exibirSaque(conta);
	}
	
	public void Depositar(double depositar) {
		conta.setSaldo(conta.getSaldo() + depositar);
		contaView.exibirConta(conta);
	}
	
	public void exibirDeposito() {
		contaView.exibirDeposito(conta);
	}

}
