package engineering.software.attendanceproject.a2s;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class A2S extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(A2S.class.getResource("UI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 480);
        stage.setTitle("A2S - Automated Attendance System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        /*
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter the number of students: ");
        int studentCount = input.nextInt();
        for (int i = 0; i < studentCount; i++) {

            System.out.print("Please enter student first name: ");
            String firstName = input.next();

            System.out.print("Please enter student middle initial: ");
            String middleInitial = input.next();

            System.out.print("Please enter student last name: ");
            String lastName = input.next();

            StudentList.addStudent(new Student(i, firstName, middleInitial.charAt(0), lastName));
        }
        StudentList.sortStudents();

        for (int i = 0; i < StudentList.getStudents().size(); i++) {
            System.out.println(StudentList.getStudents().get(i));
        }


        System.out.println("You may now take attendance: ");

        Attendance dailyAttendance = new Attendance();
        dailyAttendance.addStudentsToAttendance(StudentList.getStudents());

        AttendanceInformation studentAttendanceInformation = dailyAttendance.getStudentAttendanceInformation(0);
        System.out.println(studentAttendanceInformation);
        */
    }
}