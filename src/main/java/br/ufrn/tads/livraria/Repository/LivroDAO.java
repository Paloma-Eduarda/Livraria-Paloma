package br.ufrn.tads.livraria.Repository;

import br.ufrn.tads.livraria.Model.Livro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    Connection connection = BancoDados.getConnection();

    public List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<>();

        String sql = "SELECT * FROM livro";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Livro livro = new Livro();
                livro.setTitulo(resultSet.getString("titulo"));
                livro.setGenero(resultSet.getString("genero"));
                livro.setAno(resultSet.getInt("anopublicacao"));
                livro.setAutor(resultSet.getString("autor"));
                livro.setEditora(resultSet.getString("editora"));
                livro.setId(resultSet.getInt("idLivro"));

                livros.add(livro);
            }

        }catch (SQLException e){
            System.out.println("erro");;
        }

        return livros;
    }

    public boolean delete(Livro livro) {
        String sql = "DELETE FROM livro WHERE idLivro = ?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, livro.getId());
            preparedStatement.execute();
            return true;

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        } finally {

            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection!= null) connection.close();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    }
    public int cadastrarLivro(Livro livro){

        String sql = "INSERT INTO Livro (titulo, genero, editora, anoPublicacao, autor)\n" +
                "VALUES (?,?,?,?,?);";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, livro.getTitulo());
            preparedStatement.setString(2, livro.getGenero());
            preparedStatement.setString(3, livro.getEditora());
            preparedStatement.setInt(4, livro.getAno());
            preparedStatement.setString(5, livro.getAutor());

            preparedStatement.execute();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    public boolean alterar(Livro livro) {
        String sql = "UPDATE livro SET titulo=?, genero=?, editora=?, anoPublicacao=?, autor=? WHERE idLivro=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getGenero());
            stmt.setString(3, livro.getEditora());
            stmt.setInt(4, livro.getAno());
            stmt.setString(5, livro.getAutor());
            stmt.setInt(6, livro.getId());

            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}


