package engineering.software.attendanceproject.a2s;


/*

    container class for a single student's attendance information

 */
public class AttendanceInformation {

    private boolean finalized = false;
    private Student student;
    private boolean present = true;
    private boolean excused = false;
    private boolean tardy = false;


    public AttendanceInformation(Student student) {
        this.student = student;
    }

    public void setPresent(boolean value) {

        if (isFinalized()) return;

        present = value;
    }

    public void setTardy(boolean value) {

        if (isFinalized()) return;

        tardy = value;
    }

    public void setExcused(boolean value) {

        if (isFinalized()) return;

        excused = value;
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

    public boolean isExcused() {
        return excused;
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

    public boolean isFinalized() {
        return finalized;
    }

    public void finalizeAttendance() {
        finalized = false;
    }

}
