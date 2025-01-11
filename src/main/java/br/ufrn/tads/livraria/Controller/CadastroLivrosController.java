package br.ufrn.tads.livraria.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CadastroLivrosController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tituloLivroInput;
    @FXML
    private TextField autorLivroInput;
    @FXML
    private TextField isbnLivroInput;
    @FXML
    private TextField anoLivroInput;
    @FXML
    private TextField editoraLivroInput;
    @FXML
    private TextField paginasLivroInput;
    @FXML
    private TextField generoLivroInput;
    @FXML
    private Button botaoCadastrarLivro;
    @FXML
    private Button botaoCancelarCadastroLivros;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
