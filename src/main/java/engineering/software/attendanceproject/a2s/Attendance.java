package engineering.software.attendanceproject.a2s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*

class to keep track of attendance for a single day

 */

public class Attendance {

    private boolean finalized = false;
    public HashMap<Integer, AttendanceInformation> studentInformationMap = new HashMap<>();

    public AttendanceInformation getStudentAttendanceInformation(int studentId) {
        return studentInformationMap.get(studentId);
    }

    public void addStudentsToAttendance(ArrayList<Student> students) {

        if (isFinalized()) return;

        for (Student student : students) {

            AttendanceInformation studentAttendanceInformation = new AttendanceInformation(student);
            studentAttendanceInformation.setPresent(true);
            studentAttendanceInformation.setTardy(false);

            studentInformationMap.put(student.getStudentId(), studentAttendanceInformation);

        }

    }

    public void finalizeAttendance() {

        for (Map.Entry<Integer, AttendanceInformation> studentInformationEntry : studentInformationMap.entrySet()) {

            AttendanceInformation studentAttendanceInformation = studentInformationEntry.getValue();
            studentAttendanceInformation.finalizeAttendance();

        }

        finalized = true;
    }

    public boolean isFinalized() {

        return finalized;
    }
}
