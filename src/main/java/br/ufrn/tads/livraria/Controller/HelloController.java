package br.ufrn.tads.livraria.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Menu menuCadastro;
    @FXML
    private Menu menuConsultaLivros;
    @FXML
    private AnchorPane anchorPane;

    public HelloController() {
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}