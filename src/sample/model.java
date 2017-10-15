package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class model {
    private final StringProperty text = new SimpleStringProperty("Initial text...");

    public StringProperty textProperty() {
        return text ;
    }

    public final void setText(String text) {
        textProperty().set(text);
    }

    public final String getText() {
        return textProperty().get();
    }
}
