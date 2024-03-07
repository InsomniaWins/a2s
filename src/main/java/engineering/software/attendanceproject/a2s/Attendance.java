package engineering.software.attendanceproject.a2s;

import java.util.ArrayList;
import java.util.HashMap;


/*

class to keep track of attendance for a single day

 */

public class Attendance {

    HashMap<Integer, AttendanceInformation> studentInformationMap = new HashMap<>();

    public AttendanceInformation getStudentAttendanceInformation(int studentId) {
        return studentInformationMap.get(studentId);
    }

    public void addStudentsToAttendance(ArrayList<Student> students) {

        for (Student student : students) {

            AttendanceInformation studentAttendanceInformation = new AttendanceInformation(student);
            studentAttendanceInformation.setPresent(true);
            studentAttendanceInformation.setTardy(false);

            studentInformationMap.put(student.getStudentId(), studentAttendanceInformation);

        }

    }
}
