module com.example.javafxdb261007 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdb261007 to javafx.fxml;
    exports com.example.javafxdb261007;
}