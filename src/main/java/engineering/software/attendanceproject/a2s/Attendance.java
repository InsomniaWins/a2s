package engineering.software.attendanceproject.a2s;

import java.util.ArrayList;
import java.util.HashMap;


/*

class to keep track of attendance for a single day

 */

public class Attendance {

    HashMap<Integer, AttendanceInformation> studentInformationMap = new HashMap<>();

    public void addStudentsToAttendance(ArrayList<Student> students) {

        for (Student student : students) {

            AttendanceInformation studentInformation = new AttendanceInformation();

            studentInformation.setPresent(true);
            studentInformation.setTardy(false);

            studentInformationMap.put(student.getStudentId(), studentInformation);

        }

    }



}
