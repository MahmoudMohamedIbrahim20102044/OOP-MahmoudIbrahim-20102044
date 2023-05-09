package com.example.fourflags;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane=new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\uk.gif"),0,0);
        pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\ca.gif"),1,0);
        pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\china.gif"),0,1);
        pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\us.gif"),1,1);
        Scene scene=new Scene(pane);
        stage.setTitle("Flags");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}