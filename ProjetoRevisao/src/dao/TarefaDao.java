package dao;

import model.TarefaModel;

import java.sql.*;

public class TarefaDao {
    private String url = "jdbc:mysql://localhost:3306/gerenciador_de_tarefas";
    private String usuario = "root";
    private String senha = "aluno";
    private Connection connection;

    public void adicionarTarefa(TarefaModel tarefaModel){

        try(Connection connection = DriverManager.getConnection(url, usuario, senha)){
            String sql = "INSERT INTO tarefa "
                    + "(id_tarefa, titulo,descricao, status)"
                    + "VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,tarefaModel.getId_titulo());
            preparedStatement.setString(2,tarefaModel.getTitulo());
            preparedStatement.setString(3,tarefaModel.getDescricao());
            preparedStatement.setString(4, String.valueOf(tarefaModel.getStatus()));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean abreConexao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, usuario, senha);

            if (connection != null) {
                return true;
            } else {
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public void fechaConexao() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean testaConexao() {
        boolean conectou = abreConexao();

        fechaConexao();

        return conectou;
    }

}
