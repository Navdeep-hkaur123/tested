module com.example.tested {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.tested to javafx.fxml;
    exports com.example.tested;
}