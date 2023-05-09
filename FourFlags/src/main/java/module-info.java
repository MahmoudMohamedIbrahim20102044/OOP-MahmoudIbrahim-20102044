module com.example.fourflags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fourflags to javafx.fxml;
    exports com.example.fourflags;
}