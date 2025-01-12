package br.ufrn.tads.livraria.Repository;

import br.ufrn.tads.livraria.Model.Livro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    Connection connection = BancoDados.getConnection();

    public List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<Livro>();
        String sql = "SELECT l.*, a.* FROM livro JOIN Livro_has_Autor la ON l.idLivro = la.idLivro JOIN Autor a ON la.idAutor = a.idAutor";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
               // Livro livro = new Livro();

            }

        }catch (SQLException e){
            System.out.println("erro");;
        }


        return livros;
    }
}
