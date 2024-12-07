package es.ieslosmontecillos.eventos_componentes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MiControlApp extends Application {
    @Override
    public void start(Stage stage) {
        MiControl miControl = new MiControl();
        Label label = new Label("Haz clic en el control");

        miControl.setOnAction(event -> label.setText("¡Control clickeado!"));

        VBox root = new VBox(10, miControl, label);
        root.setStyle("-fx-padding: 20;");
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("MiControl Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
