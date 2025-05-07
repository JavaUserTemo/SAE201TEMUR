module com.example.demov3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.sae.moutonloup to javafx.fxml;
    exports com.sae.moutonloup;
}