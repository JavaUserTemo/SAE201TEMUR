module com.example.demov3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.demov3 to javafx.fxml;
    exports com.example.demov3;
}