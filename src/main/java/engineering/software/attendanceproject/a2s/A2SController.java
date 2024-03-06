package engineering.software.attendanceproject.a2s;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class A2SController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}