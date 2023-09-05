package principal;

import controller.PessoaController;

public class Principal {
    public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();
        pessoaController.adicionarListaPessoas("Gabriel","Masculino",1.98,56.8,20);
        pessoaController.exibirListaDePessoas();

    }
}
