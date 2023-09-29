package view;

import model.TarefaModel;

import java.util.List;

public class TarefaView {


    public void exibirTarefa(TarefaModel tarefa){
        System.out.println("======Lista de Tarefas:=====");
        System.out.println("ID:" + tarefa.getId_tarefa());
        System.out.println("Titulo:" + tarefa.getTitulo());
        System.out.println("Descricao:" + tarefa.getDescricao());
        System.out.println("Status:" + tarefa.getStatus());
        System.out.println("\n");
    }

    public void listarTarefas(List<TarefaModel> listaDeTarefas){
        for (TarefaModel tarefaModel : listaDeTarefas){
            System.out.println("Tarefa:" + tarefaModel.getId_tarefa() + tarefaModel.getTitulo() + tarefaModel.getDescricao() + tarefaModel.getStatus());
        }
        System.out.println("================");
    }
    public void exibeMensagemAdiciona(TarefaModel tarefaModel){
        System.out.println("Adicionada com sucesso");
    }


}
