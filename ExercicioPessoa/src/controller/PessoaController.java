package controller;

import dao.PessoaDao;
import model.Pessoa;
import view.PessoaView;

import java.util.List;

public class PessoaController {
    private PessoaView pessoaView;
    private PessoaDao pessoaDao;
    private Pessoa pessoa;

    public PessoaController(){
        pessoaView = new PessoaView();
        pessoaDao = new PessoaDao();
    }

    //Método para adicionar Pessoa na lista
    public void adicionarListaPessoas(String nome, String sexo, double altura, double peso, int idade){
        Pessoa pessoa = new Pessoa(nome,sexo,altura,peso,idade);
        pessoaDao.addPessoa(pessoa);
    }

    //Metodo exibir lista de Pessoas
    public void exibirListaDePessoas(){
        List<Pessoa>listaDePessoas = pessoaDao.getListaDePessoas();
        pessoaView.exibirListaDePessoa(listaDePessoas);
    }

}
