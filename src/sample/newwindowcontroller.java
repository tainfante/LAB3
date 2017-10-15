package sample;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class newwindowcontroller {

    private StringProperty text ;
    @FXML
    private Button btn1;
    @FXML
    private Label lbl1;
    @FXML
    private TextField txt1;
    public void initialize() {
        text = new SimpleStringProperty(this, "text");
    }
    public StringProperty textProperty() {
        return text ;
    }
    public String getText() {
        return text.get();
    }
    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        String text1=new String();
        text1=txt1.getText();
        if (text.equals("")){
            FXMLLoader fxmlLoader1 =new FXMLLoader(getClass().getResource("error.fxml"));
            Parent root2=(Parent) fxmlLoader1.load();
            Stage stage2=new Stage();
            stage2.setTitle(" 666 critical ERROR");
            stage2.setScene(new Scene(root2));
            stage2.initModality(Modality.WINDOW_MODAL);
            stage2.initOwner(btn1.getScene().getWindow());
            stage2.show();
        }
        else{
            Stage modalStage =(Stage) btn1.getScene().getWindow();
            modalStage.close();

        }
    }
}
