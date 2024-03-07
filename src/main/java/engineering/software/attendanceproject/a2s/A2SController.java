package engineering.software.attendanceproject.a2s;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A2SController {

    @FXML
    public TextField firstNameTextField;
    @FXML
    public TextField middleInitialTextField;
    @FXML
    public TextField lastNameTextField;
    @FXML
    public VBox studentsVBox;
    @FXML
    public Button addStudentButton;

    @FXML
    public Button finalizeButton;


    @FXML
    public Label studentsPresentLabel;

    @FXML
    public Label studentsTardyLabel;

    @FXML
    public Label studentsExcusedLabel;

    @FXML
    public Label presentToAbsentLabel;

    @FXML
    public Label onTimeToTardyLabel;

    private HashMap<Integer, HBox> studentHBoxes = new HashMap<>();


    public HBox makeStudentAttendanceHBox(Student student) {
        HBox hBox = new HBox();
        hBox.prefHeight(25);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER_LEFT);


        Label studentNameLabel = new Label(student.getFullNameReversed());
        hBox.getChildren().add(studentNameLabel);


        CheckBox presentCheckBox = new CheckBox();
        presentCheckBox.setOnAction((event) -> updateLabels());
        presentCheckBox.setText("Present");

        CheckBox tardyCheckBox = new CheckBox();
        tardyCheckBox.setOnAction((event) -> updateLabels());
        tardyCheckBox.setText("Tardy");

        CheckBox excusedCheckBox = new CheckBox();
        excusedCheckBox.setOnAction((event) -> updateLabels());
        excusedCheckBox.setText("Excused");

        hBox.getChildren().add(presentCheckBox);
        hBox.getChildren().add(tardyCheckBox);
        hBox.getChildren().add(excusedCheckBox);


        return hBox;
    }

    public void updateLabels() {

        int presentAmount = 0;
        int absentAmount = 0;
        int onTimeAmount = 0;
        int tardyAmount = 0;
        int excusedAmount = 0;

        for (Map.Entry<Integer, HBox> entry : studentHBoxes.entrySet()) {

            if (((CheckBox) entry.getValue().getChildren().get(1)).isSelected()) {
                presentAmount += 1;
            } else {
                absentAmount += 1;
            }

            if (((CheckBox) entry.getValue().getChildren().get(2)).isSelected()) {
                tardyAmount += 1;
            } else {
                onTimeAmount += 1;
            }

            if (((CheckBox) entry.getValue().getChildren().get(3)).isSelected()) {
                excusedAmount += 1;
            }

        }




        studentsPresentLabel.setText("Students Present: " + presentAmount);
        studentsTardyLabel.setText("Students Absent: " + absentAmount);
        studentsExcusedLabel.setText("Students Excused: " + excusedAmount);
        presentToAbsentLabel.setText("Present/Absent: " + (absentAmount == 0 ? presentAmount + "/0" : presentAmount + "/" + absentAmount));
        onTimeToTardyLabel.setText("On-Time/Tardy: " + (tardyAmount == 0 ? onTimeAmount + "/0" : onTimeAmount + "/" + tardyAmount));

    }

    @FXML
    public void onFinalizeButtonPressed() {

        finalizeAttendance();

    }

    @FXML
    public void finalizeAttendance() {
        finalizeButton.setDisable(true);
        addStudentButton.setDisable(true);
        for (Student student : StudentList.getStudents()) {
            HBox hBox = studentHBoxes.get(student.getStudentId());
            hBox.getChildren().get(1).setDisable(true);
            hBox.getChildren().get(2).setDisable(true);
            hBox.getChildren().get(3).setDisable(true);
        }

    }

    @FXML
    public void onAddStudentButtonPressed() {

        Student student = new Student(firstNameTextField.getText(), middleInitialTextField.getText().charAt(0), lastNameTextField.getText());
        StudentList.addStudent(student);
        StudentList.sortStudents();

        HBox studentHBox = makeStudentAttendanceHBox(student);

        studentHBoxes.put(student.getStudentId(), studentHBox);
        updateStudentsVBox();

    }

    private void updateStudentsVBox() {

        studentsVBox.getChildren().clear();

        for (Student student : StudentList.getStudents()) {
            HBox hBox = studentHBoxes.get(student.getStudentId());
            studentsVBox.getChildren().add(hBox);
        }

        updateLabels();

    }
}