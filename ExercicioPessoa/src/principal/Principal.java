package principal;

import controller.PessoaController;
import dao.PessoaDao;


public class Principal {
    public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();
        pessoaController.adicionarListaPessoas("Lebron James", "Masculino", 2.06, 113.4, 38);
        pessoaController.adicionarListaPessoas("Jayson Tatum", "Masculino", 2.03, 95.0, 25);
        pessoaController.adicionarListaPessoas("Stephen Curry", "Masculino", 1.91, 85.0, 35);
        pessoaController.adicionarListaPessoas("Ja Morant", "Masculino", 1.88, 79.0, 24);
        pessoaController.adicionarListaPessoas("Luka Doncic", "Masculino", 2.01, 104.0, 24);
        pessoaController.adicionarListaPessoas("Damian Lillard","Masculino",1.88,88.0,33);
        pessoaController.adicionarListaPessoas("Victor Wembanyama", "Masculino", 2.26, 95.0, 19);
        pessoaController.organizarAlturaCrescente();
        pessoaController.exibirListaDePessoas();





    }

}
