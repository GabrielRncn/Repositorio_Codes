package controller;

import dao.PessoaDao;
import model.Pessoa;
import view.PessoaView;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PessoaController {
    private PessoaView pessoaView;
    private PessoaDao pessoaDao;
    private Pessoa pessoa;

    public PessoaController(){
        pessoaDao = new PessoaDao();
        pessoaView = new PessoaView();
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

    //Metodo para organizar Idade Crescentemente a lista
    public void organizarListaCrescente() {
        Collections.sort(pessoaDao.getListaDePessoas(), new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Integer.compare(pessoa1.getIdade(), pessoa2.getIdade());
            }
        });
    }

    //Metodo para organizar Idade Decrescentemente a lista
    public void organizarListaDecrescente() {
        Collections.sort(pessoaDao.getListaDePessoas(), new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Integer.compare(pessoa2.getIdade(), pessoa1.getIdade());
            }
        });
    }

    //Metodo para organizar Altura Crescentemente a lista
    public void organizarAlturaCrescente(){
        Collections.sort(pessoaDao.getListaDePessoas(), new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
            }
        });
    }

    //Metodo para organizar Altura Derescentemente a lista
    public void organizarAlturaDecrescente(){
        Collections.sort(pessoaDao.getListaDePessoas(), new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Double.compare(pessoa2.getAltura(), pessoa1.getAltura());
            }
        });
    }
}
