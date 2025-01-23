package br.ufrn.tads.livraria.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Menu menuCadastro;
    @FXML
    private Menu menuLivros;
    @FXML
    private MenuItem itemConsultaLivros;
    @FXML
    private AnchorPane anchorPane;

    public HelloController() {
    }

    public void handleItemConsultaLivros() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/ufrn/tads/livraria/consultaLivro.fxml"));
        anchorPane.getChildren().setAll(a);
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}