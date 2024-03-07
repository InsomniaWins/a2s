package engineering.software.attendanceproject.a2s;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class A2S extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(A2S.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        StudentList.addStudent(new Student(0, "Andrew", 'm', "Ingram"));

        Attendance dailyAttendance = new Attendance();
        dailyAttendance.addStudentsToAttendance(StudentList.getStudents());

        AttendanceInformation studentAttendanceInformation = dailyAttendance.getStudentAttendanceInformation(0);
        System.out.println(studentAttendanceInformation);

    }
}