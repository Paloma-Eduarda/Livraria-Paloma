package br.ufrn.tads.livraria.Controller;

import br.ufrn.tads.livraria.Model.Livro;
import br.ufrn.tads.livraria.Repository.LivroDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

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
    private TableColumn<Livro, String> colunaTabelaGenero;
    @FXML
    private TableColumn<Livro, String> colunaTabelaAno;
    @FXML
    private Label labelIdLivro;
    @FXML
    private Label labelTituloLivro;
    @FXML
    private Label labelAutorLivro;
    @FXML
    private Label labelEditoraLivro;
    @FXML
    private Label labelGeneroLivro;
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

    LivroDAO livroDAO = new LivroDAO();
    Livro livro = new Livro();

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        carregarTabelaLivros();
        tabelaLivro.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selecionarLivro(newValue));
    }
    public void carregarTabelaLivros() {
        colunaTabelaTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colunaTabelaAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colunaTabelaEditora.setCellValueFactory(new PropertyValueFactory<>("editora"));
        colunaTabelaGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colunaTabelaAno.setCellValueFactory(new PropertyValueFactory<>("ano"));

        livros = livroDAO.getLivros();
        obsLivros = FXCollections.observableArrayList(livros);
        tabelaLivro.setItems(obsLivros);
    }
    public void selecionarLivro(Livro livro){
        if (livro != null) {
            labelIdLivro.setText(String.valueOf(livro.getId()));
            labelTituloLivro.setText(livro.getTitulo());
            labelAutorLivro.setText(livro.getAutor());
            labelAnoLivro.setText(String.valueOf(livro.getAno()));
            labelEditoraLivro.setText(livro.getEditora());
            labelGeneroLivro.setText(livro.getGenero());
        } else {
            labelIdLivro.setText("");
            labelTituloLivro.setText("");
            labelAutorLivro.setText("");
            labelAnoLivro.setText("");
            labelEditoraLivro.setText("");
            labelGeneroLivro.setText("");
        }


    }
    @FXML
    public void handleButtonInserir() throws IOException {
        Livro livro = new Livro();
        boolean buttonConfirmarClicked = showFXMLAnchorPaneCadastrosLivrosDialog(livro);
        if (buttonConfirmarClicked) {
            livroDAO.cadastrarLivro(livro);
            carregarTabelaLivros();
        }
    }

    @FXML
    public void handleButtonAlterar() throws IOException {
        Livro livro = tabelaLivro.getSelectionModel().getSelectedItem();
        if (livro != null) {
            boolean buttonConfirmarClicked = showFXMLAnchorPaneCadastrosLivrosDialog(livro);
            if (buttonConfirmarClicked) {
                livroDAO.alterar(livro);
                carregarTabelaLivros();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Por favor, escolha um livro na Tabela!");
            alert.show();
        }
    }
    @FXML
    public void handleButtonRemover() throws IOException {
        Livro livro = tabelaLivro.getSelectionModel().getSelectedItem();
        if (livro != null) {
            livroDAO.delete(livro);
            carregarTabelaLivros();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Por favor, escolha um Livro na Tabela!");
            alert.show();
        }
    }

    public boolean showFXMLAnchorPaneCadastrosLivrosDialog(Livro livro) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(CadastroLivrosController.class.getResource("/br/ufrn/tads/livraria/cadastroLivros.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        Stage dialogStage = new Stage();
        dialogStage.setTitle("Cadastro de Livros");
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        CadastroLivrosController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setLivro(livro);

        dialogStage.showAndWait();

        return controller.isConfirmar();

    }

}