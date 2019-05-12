package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

       primaryStage.setHeight(430);
        primaryStage.setWidth(770);


        primaryStage.setTitle("Prefix Infix Postfix");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);

    }
}
