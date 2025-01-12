package br.ufrn.tads.livraria.Controller;

import br.ufrn.tads.livraria.Model.Livro;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ConsultaLivroController implements Initializable {
    @FXML
    private TableView<Livro> tabelaLivro;
    @FXML
    private TableColumn<Livro, String> colunaTabelaTitulo;
    @FXML
    private TableColumn<Livro, String> colunaTabelaAutor;
    @FXML
    private TableColumn<Livro, String> colunaTabelaEditora;
    @FXML
    private TableColumn<Livro, String> colunaTabelaIsbn;
    @FXML
    private TableColumn<Livro, String> colunaTabelaGenero;
    @FXML
    private Label labelTituloLivro;
    @FXML
    private Label labelAutorLivro;
    @FXML
    private Label labelEditoraLivro;
    @FXML
    private Label labelIsbnLivro;
    @FXML
    private Label labelGeneroLivro;
    @FXML
    private Label labelPaginasLivro;
    @FXML
    private Label labelAnoLivro;
    @FXML
    private Button botaoRemover;
    @FXML
    private Button botaoAlterar;
    private List<Livro> livros;
    private ObservableList<Livro> obsLivros;

    public ConsultaLivroController() {
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}