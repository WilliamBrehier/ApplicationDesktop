module com.example.applicationdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.applicationdesktop to javafx.fxml;
    exports com.example.applicationdesktop;
    exports com.example.applicationdesktop.controller;
    opens com.example.applicationdesktop.controller to javafx.fxml;
}