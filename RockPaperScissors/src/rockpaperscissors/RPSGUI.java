package rockpaperscissors;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TechNathan
 */
public class RPSGUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btRock = new Button("Rock");
        Button btPaper = new Button("Paper");
        Button btScissors = new Button("Scissors");
        Text textRock = new Text();
        Text textPaper = new Text();
        Text textScissors = new Text();
        hBox.getChildren().addAll(btRock, btPaper, btScissors);
        
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(hBox, textRock);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(vBox);
        
        btRock.setOnMouseClicked(e -> {
            textRock.setText("rock works");
        });
        
        btPaper.setOnMouseClicked(e -> {
            textPaper.setText("paper works");
        });
        
        btScissors.setOnMouseClicked(e -> {
            textScissors.setText("scissors works");
        });
        
        primaryStage.setTitle("Rock Paper Scissors");
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
