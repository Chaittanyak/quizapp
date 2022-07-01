package quizapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quizapp.database.DatabaseHandler;

public class Quizapp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/quizapp/login/login.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Quiz App");
        stage.setScene(scene);
        stage.show();
        new Thread(()->{
            DatabaseHandler.create_tables();
        }).start();
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        launch(args);
    }
    
}
