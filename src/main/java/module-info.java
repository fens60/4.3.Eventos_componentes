module es.ieslosmontecillos.eventos_componentes {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.eventos_componentes to javafx.fxml;
    exports es.ieslosmontecillos.eventos_componentes;
}