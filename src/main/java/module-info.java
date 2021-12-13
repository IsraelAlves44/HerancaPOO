module com.example.herancapoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.herancapoo to javafx.fxml;
    exports com.example.herancapoo;
}