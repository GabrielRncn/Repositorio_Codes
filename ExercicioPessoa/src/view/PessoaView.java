package view;

import model.Pessoa;

import java.util.List;

public class PessoaView {
        public void exibirListaDePessoa(List<Pessoa> listaDePessoas) {
            System.out.println("------------Lista de Pessoas---------");
            for(Pessoa pessoa : listaDePessoas) {
                System.out.println("pessoa:" + pessoa.getNome() + "\n" + pessoa.getSexo() + "\n" +pessoa.getPeso() + "\n" + pessoa.getAltura() + "\n" + pessoa.getIdade() + "\n" + pessoa.getCalcIMC());
            }
        }
}
