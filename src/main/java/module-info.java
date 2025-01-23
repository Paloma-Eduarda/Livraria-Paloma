module br.ufrn.tads.livraria {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.desktop;

    opens br.ufrn.tads.livraria to javafx.fxml;
    exports br.ufrn.tads.livraria;
    exports br.ufrn.tads.livraria.Controller;
    opens br.ufrn.tads.livraria.Controller to javafx.fxml;
    opens br.ufrn.tads.livraria.Model to javafx.base;
}