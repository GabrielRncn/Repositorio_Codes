package Main;

import java.util.Scanner;

import controller.PaisController;

public class Main {

	public static void main(String[] args) {
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 4) {
			System.out.println("Menu");
			System.out.println("1- Adicionar pais");
			System.out.println("2- Exibir todos os paises");
			System.out.println("3- Remover pais");
			System.out.println("4- Sair");
			System.out.println("Escolha uma opçao");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do pais :");
				scanner.nextLine();
				String nome = scanner.nextLine();

				System.out.println("Digite a capital do pais" + nome + ":");
				String capital = scanner.nextLine();
				paisController.adicionarPais(nome, capital);
				
				break;

			case 2:
				paisController.exibirListaDePaises();
				break;
			case 3:
				System.out.println("Coloque o Pais que deseja remover:");
				scanner.nextLine();
				nome = scanner.nextLine();
				paisController.removerPais(nome);
				break;
			case 4:
				System.out.println("Saindo....");
				break;
			
			default:
				System.out.println("Opçao invalida");
				break;

			}
		}
		
	scanner.close();}
}
