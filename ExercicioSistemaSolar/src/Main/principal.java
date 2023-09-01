package Main;

import java.util.Scanner;

import controller.PlanetaController;

public class principal {
 public static void main(String[] args) {
	PlanetaController planetaController = new PlanetaController();
	
	Scanner lerTeclado = new Scanner(System.in);
	int opcao = -1;
	while(opcao != 0) {
		System.out.println("==============");
		System.out.println("==== Menu ====");
		System.out.println("1. Adicionar Planeta");
		System.out.println("2. Exibir lista de Planetas");
		System.out.println("3. Remover Planeta da lista"); 
		System.out.println("0. Sair");
		System.out.println("=================");
		System.out.print("Escolha uma opção: ");
	
	
		try {

		
		opcao = lerTeclado.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Opção inválida. Por favor, digite um número inteiro válido.");
	        lerTeclado.nextLine();
				}
	
		switch (opcao) {
		
		case 1:
			
			
			System.out.print("Digite o nome do Planeta: ");
			lerTeclado.nextLine();
			
			String nomeAdicionar = lerTeclado.nextLine();

			planetaController.adicionarListaPlanetas(nomeAdicionar);
			break;

		case 2:
			
			planetaController.exibirListaDePaises();
			break;

		case 3:
			
			System.out.println("Digite o nome do Planeta a ser removido: ");
			String nomeRemover = lerTeclado.next();
			planetaController.removerListaPlanetas(nomeRemover);
			break;
		

		case 0:
		
			System.out.println("Saindo...");
			break;

		default:

			System.out.println("Opção inválida.");
			break;
			
		}
		
	
		}
			
		}
			
 	}
