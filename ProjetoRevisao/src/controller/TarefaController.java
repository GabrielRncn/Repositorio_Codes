package controller;

import dao.TarefaDao;
import model.TarefaModel;
import view.TarefaView;

public class TarefaController {
    private TarefaView tarefaView;

    private TarefaDao tarefaDao;

    public TarefaController(){
        TarefaView tarefaView = new TarefaView();
        TarefaDao tarefaDao = new TarefaDao();
    }
    public void adicionarListaTarefas(int id_titulo, String titulo, String descricao, char status){
        TarefaModel tarefaModel = new TarefaModel(id_titulo, titulo, descricao, status);
        tarefaDao.adicionarTarefa(tarefaModel);
        tarefaView.exibeMensagemAdiciona(tarefaModel);
    }

}
