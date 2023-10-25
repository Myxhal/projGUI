module com.example.projgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projgui to javafx.fxml;
    exports com.example.projgui;
}