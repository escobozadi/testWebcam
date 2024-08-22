module com.example.testwebcam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires webcam.capture;


    opens com.example.testwebcam to javafx.fxml;
    exports com.example.testwebcam;
}