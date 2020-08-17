package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Main extends Application {

    public ChoiceBox choicePron;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Friend's Book");
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
