package engineering.software.attendanceproject.a2s;


/*

    container class for a single student's attendance information

 */
public class AttendanceInformation {

    private boolean present = true;
    private boolean tardy = false;


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

}
