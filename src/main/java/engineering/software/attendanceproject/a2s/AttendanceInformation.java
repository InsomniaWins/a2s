package engineering.software.attendanceproject.a2s;


/*

    container class for a single student's attendance information

 */
public class AttendanceInformation {

    private Student student;
    private boolean present = true;
    private boolean tardy = false;


    public AttendanceInformation(Student student) {
        this.student = student;
    }

    public void setPresent(boolean value) {
        present = value;
    }

    public void setTardy(boolean value) {
        tardy = value;
    }



    public boolean isPresent() {
        return present;
    }

    public boolean isAbsent() {
        return !present;
    }

    public boolean isTardy() {
        return tardy;
    }

    public boolean isOnTime() {
        return !tardy;
    }

    @Override
    public String toString() {
        if (student == null) {
            return "Attendance Information: NO STUDENT!";
        }

        return "Attendance Information: {" +
                "Name: " + student.getFullName() +
                ", Present: " + isPresent() +
                ", Tardy: " + isTardy() +
                "}";
    }

}
