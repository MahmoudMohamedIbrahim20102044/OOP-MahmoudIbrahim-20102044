package com.example.assignmentcircleinthecenter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane=new Pane();
        Circle circle=new Circle(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane);
        stage.setTitle("Circle in the center");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}