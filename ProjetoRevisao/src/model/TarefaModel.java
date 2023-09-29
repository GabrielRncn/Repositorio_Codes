package model;

public class TarefaModel {
    private int id_titulo;
    private String titulo;
        private String descricao;
        private String status;
    public TarefaModel(int id_titulo, String titulo, String descricao, String status){
        this.id_titulo = id_titulo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId_titulo() {
        return id_titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
}

