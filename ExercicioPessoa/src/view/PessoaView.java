package view;

import model.Pessoa;

import java.util.List;

public class PessoaView {
        public void exibirListaDePessoa(List<Pessoa> listaDePessoas) {
            System.out.println("------------Lista de Jogadores NBA:---------");
            for(Pessoa pessoa : listaDePessoas) {
                System.out.println("-----------------------------------------");
                System.out.println("Jogador:" + pessoa.getNome() + "\n" + "Sexo:" + pessoa.getSexo() + "\n" + "Peso:" + pessoa.getPeso() + "\n" + "Altura:" + pessoa.getAltura() + "\n" + "Idade:" + pessoa.getIdade() + "\n" + "IMC:" + pessoa.getCalcIMC());
            }
        }
}
