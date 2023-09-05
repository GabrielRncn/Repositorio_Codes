package dao;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaDao {
    private List<Pessoa> listaDePessoas ;
    public PessoaDao(){
        listaDePessoas = new ArrayList<>();
    }


    public void addPessoa(Pessoa pessoa){
        listaDePessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa){
        listaDePessoas.remove(pessoa);
    }

    //Retornar a lista
    public List<Pessoa> getListaDePessoas(){
        return listaDePessoas;
    }
}
