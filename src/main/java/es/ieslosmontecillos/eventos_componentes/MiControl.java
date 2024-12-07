package es.ieslosmontecillos.eventos_componentes;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

public class MiControl extends Region {
    private ObjectProperty<EventHandler<MouseEvent>> onAction = new SimpleObjectProperty<>();

    public MiControl() {
        super();
        setStyle("-fx-border-color: blue;");
        setPrefSize(100, 100);

        this.setOnMouseClicked(event -> {
            if (onAction.get() != null) {
                onAction.get().handle(event);
            }
        });
    }

    public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() {
        return onAction;
    }

    public final void setOnAction(EventHandler<MouseEvent> handler) {
        onAction.set(handler);
    }

    public final EventHandler<MouseEvent> getOnAction() {
        return onAction.get();
    }
}
