package controller;

import dao.TarefaDao;
import model.TarefaModel;
import view.TarefaView;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private TarefaView tarefaView;

    private TarefaDao tarefaDao;

    private List<TarefaModel> listaDeTarefas;

    public TarefaController(){
        listaDeTarefas = new ArrayList<>();
        tarefaView = new TarefaView();
        tarefaDao = new TarefaDao();
    }
    public void adicionarListaTarefas(int id_titulo, String titulo, String descricao, String status){
        TarefaModel tarefaModel = new TarefaModel(id_titulo, titulo, descricao, status);
        tarefaDao.adicionarTarefa(tarefaModel);
        tarefaView.exibeMensagemAdiciona(tarefaModel);
    }

    public void removerTarefa(int id_tarefa){
        tarefaDao.removerTarefa(id_tarefa);

    }

}
