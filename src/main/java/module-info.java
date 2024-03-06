module engineering.software.attendanceproject.a2s {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens engineering.software.attendanceproject.a2s to javafx.fxml;
    exports engineering.software.attendanceproject.a2s;
}