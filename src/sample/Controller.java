package sample;


import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.stage.Window;

import java.io.IOException;
import java.lang.IllegalStateException;


public class Controller {
    private ReadOnlyStringWrapper text ;
    @FXML
    private Label label;
    @FXML
    private AnchorPane pane;
    @FXML
    private Button btn;
    public void initialize() {
        text= new ReadOnlyStringWrapper(this, "text");
        text.bind(label.textProperty());
    }
    public ReadOnlyStringProperty textProperty() {
        return text.getReadOnlyProperty();
    }
    public String getText() {
        return text.get();
    }
    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("new_window.fxml"));
        Parent root1=(Parent) fxmlLoader.load();
        Stage modalStage=new Stage();
        modalStage.setTitle("Wprowadz imie");
        modalStage.setScene(new Scene(root1));
        modalStage.initModality(Modality.WINDOW_MODAL);
        modalStage.initOwner(btn.getScene().getWindow());
        modalStage.show();
    }

}
