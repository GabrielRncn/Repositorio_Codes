package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/seubanco";
    private static final String USUARIO = "root";
    private static final String SENHA = "aluno";
    private Connection connection;

    public AlunoDAO() {
        
    }
    
 // Método para abrir uma conexão com o banco de dados
    public void abreConexao() throws SQLException {
        try {
            // Carrega o driver JDBC específico (substitua pelo driver do seu banco de dados)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados usando os atributos URL, USUARIO e SENHA
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            // Lida com erros de carregamento do driver ou conexão
            throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
        }
    }

    // Método para fechar a conexão com o banco de dados
    public void fechaConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Lida com erros de fechamento da conexão
                e.printStackTrace();
            }
        }
    }

    // Método para inserir um aluno no banco de dados
    public void inserirAluno(Aluno aluno) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)){
            String sql = "INSERT INTO aluno(id_aluno, nome, idade) VALUES(?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, aluno.getIdAluno());
            ps.setString(2, aluno.getNome());
            ps.setInt(3, aluno.getIdade());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    // Método para buscar um aluno pelo ID (id_aluno) no banco de dados
    public Aluno buscarAlunoPorId(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {

            String sql = "SELECT FROM aluno WHERE id_aluno ?;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            //fazer while .next para pegar todas as informaçoes, dar get e retornar os parametros passando por dentro de Aluno
            ResultSet rs = ps.executeUpdate();

            return null;
        }
    }

    // Método para atualizar os dados de um aluno no banco de dados
    public void atualizarAluno(Aluno aluno) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL, USUARIO,SENHA)){

            String sql = "UPDATE aluno SET id_aluno = ?, nome = ?, idade = ?;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,aluno.getIdAluno());
            ps.setString(2, aluno.getNome());
            ps.setInt(3, aluno.getIdade());

            ps.executeUpdate();
        }

    }

    // Método para excluir um aluno pelo ID (id_aluno) no banco de dados
    public void excluirAluno(int id) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL,USUARIO,SENHA)){

            String sql = "DELETE FROM aluno WHERE id_aluno ?;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
        }

    }

    // Método para listar todos os alunos no banco de dados
    public List<Aluno> listarAlunos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)){

            String sql = "SELECT * FROM aluno;";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id_aluno= resultSet.getInt("id_aluno");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");

                Aluno aluno= new Aluno(id_aluno, nome, idade);
                listarAlunos().add(aluno);

            }
        return alunos;
        }
    }
}