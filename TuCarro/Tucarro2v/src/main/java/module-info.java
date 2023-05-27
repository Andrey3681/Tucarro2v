module com.example.tucarro2v {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tucarro2v to javafx.fxml;
}