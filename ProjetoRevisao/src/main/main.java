package main;

import controller.TarefaController;
import model.TarefaModel;

public class main {
    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
       // tarefaController.adicionarListaTarefas(28, "correr","preciso correr", "a");
        tarefaController.removerTarefa(new TarefaModel(28, "correr","preciso correr", "a"));
    }
}
