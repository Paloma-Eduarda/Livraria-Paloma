package br.ufrn.tads.livraria;

import br.ufrn.tads.livraria.Model.Livro;
import br.ufrn.tads.livraria.Repository.BancoDados;
import br.ufrn.tads.livraria.Repository.LivroDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        LivroDAO livroDAO = new LivroDAO();
//        Livro livro = new Livro();
//        livro.setTitulo("A culpa é das estrelas");
//        livro.setGenero("Romance");
//        livro.setEditora("Teste");
//        livro.setAutor("Jonn");
//        livro.setAno(2020);
//        System.out.println(livroDAO.cadastrarLivro(livro));

       launch();
    }
}