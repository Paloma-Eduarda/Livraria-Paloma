package br.ufrn.tads.livraria.Controller;

import br.ufrn.tads.livraria.Model.Livro;
import br.ufrn.tads.livraria.Repository.LivroDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
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
    private TextField anoLivroInput;
    @FXML
    private TextField editoraLivroInput;
    @FXML
    private TextField generoLivroInput;
    @FXML
    private Button btnConfirmar;
    @FXML
    private Button btnCancelar;

    private final LivroDAO livroDAO = new LivroDAO();
    private Stage dialogStage;
    private Livro livro;
    private boolean confirmar = false;
    @FXML
    public void handleConfirmar() {

        livro.setTitulo(tituloLivroInput.getText());
        livro.setAutor(autorLivroInput.getText());
        livro.setAno(Integer.parseInt(anoLivroInput.getText()));
        livro.setEditora(editoraLivroInput.getText());
        livro.setGenero(generoLivroInput.getText());

        confirmar = true;
        dialogStage.close();
    }

    @FXML
    public void handleCancelar() {
        dialogStage.close();
    }

    public CadastroLivrosController() {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Stage getDialogStage() {
        return dialogStage;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public boolean isConfirmar() {
        return confirmar;
    }

    public void setConfirmar(boolean confirmar) {
        this.confirmar = confirmar;
    }


}
