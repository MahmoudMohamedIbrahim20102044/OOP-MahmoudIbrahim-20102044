module com.example.welcometojavacircle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.welcometojavacircle to javafx.fxml;
    exports com.example.welcometojavacircle;
}