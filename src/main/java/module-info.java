module com.example.monahovjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.monahovjavafx to javafx.fxml;
    exports com.example.monahovjavafx;
}