package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Error {
    @FXML
    private Button btn2;
    @FXML
    void closeButtonAction(ActionEvent event){
        Stage stage2 =(Stage) btn2.getScene().getWindow();
        stage2.close();
    }
}
