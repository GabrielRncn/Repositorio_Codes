package main;

import controller.TarefaController;

public class main {
    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        tarefaController.adicionarListaTarefas(25, "correr","preciso correr", 'a');
    }
}
