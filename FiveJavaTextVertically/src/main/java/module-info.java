module com.example.fivejavatextvertically {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fivejavatextvertically to javafx.fxml;
    exports com.example.fivejavatextvertically;
}