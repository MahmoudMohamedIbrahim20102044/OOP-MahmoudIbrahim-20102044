module com.example.assignmentcircleinthecenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignmentcircleinthecenter to javafx.fxml;
    exports com.example.assignmentcircleinthecenter;
}