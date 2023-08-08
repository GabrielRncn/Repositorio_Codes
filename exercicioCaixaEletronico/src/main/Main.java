package main;

import java.util.Scanner;

import controller.CaixaEletronicoController;

public class Main {

	public static void main(String[] args) {
		CaixaEletronicoController caixaEletronicoController = new CaixaEletronicoController();
		Scanner lerTeclado = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 4) {
			System.out.println("_____1-Sacar_____");
			System.out.println("_____2-Depositar_____");
			System.out.println("_____3-Consultar Saldo_____");
			System.out.println("_____4-Sair_____");
			opcao = lerTeclado.nextInt();

			switch (opcao) {
			case 1:
				caixaEletronicoController.exibirSaque();
				double sacar = lerTeclado.nextDouble();
				caixaEletronicoController.Sacar(sacar);
				break;
			case 2:
				caixaEletronicoController.exibirDeposito();
				double depositar = lerTeclado.nextDouble();
				caixaEletronicoController.Depositar(depositar);
				break;
			case 3:
				caixaEletronicoController.ConsultarSaldo();
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			
			default:
				System.out.println("Opção invalida!");
				break;
			}
		}
	}

}
