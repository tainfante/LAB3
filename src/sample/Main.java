package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader primaryLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        FXMLLoader secondaryLoader = new FXMLLoader(getClass().getResource("new_window.fxml"));
        Parent textAreaHolder = (Parent) primaryLoader.load();
        Parent textAreaUser = (Parent) secondaryLoader.load();
        Controller primaryController = (Controller) textAreaHolder.getController();
        newwindowcontroller secondController = (newwindowcontroller) textAreaUser.getController();
        secondController.textProperty().bind(primaryController.textProperty());

        primaryStage.setTitle("Panel logowania");
        primaryStage.setScene(new Scene(textAreaHolder, 300, 300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
