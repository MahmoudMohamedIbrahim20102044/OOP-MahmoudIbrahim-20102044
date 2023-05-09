package com.example.fivejavatextvertically;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        HBox hbox=new HBox();
        hbox.setPadding(new Insets(15,15,15,15));
        for(int i=0;i<5;i++){
            Text text=new Text("Java");
            text.setFont(Font.font("times new roman",FontWeight.BOLD,FontPosture.ITALIC,22));
            text.setRotate(90);
            text.setFill(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
            hbox.getChildren().add(text);
        }
        Scene scene=new Scene(hbox);
        primarystage.setTitle("Java Text");
        primarystage.setScene(scene);
        primarystage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}