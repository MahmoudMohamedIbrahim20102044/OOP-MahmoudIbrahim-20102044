package com.example.xo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        GridPane pane=new GridPane();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x=(int)(Math.random()*3);
                if(x==0){
                    pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\x.gif"),i,j);
                }
                else if (x==1){
                    pane.add(new ImageView("C:\\Users\\Blu-Ray\\Downloads\\Compressed\\images\\o.gif"),i,j);
                }
            }
        }
        Scene scene=new Scene(pane);
        primarystage.setTitle("XO");
        primarystage.setScene(scene);
        primarystage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}