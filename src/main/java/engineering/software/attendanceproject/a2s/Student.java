package engineering.software.attendanceproject.a2s;

public class Student {

    private final int STUDENT_ID;
    private String firstName;
    private char middleInitial;
    private String lastName;

    public Student(int studentId, String firstName, char middleInitial, String lastName) {
        this.STUDENT_ID = studentId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return STUDENT_ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getFullName() {
        return firstName + " " + middleInitial + " " + lastName;
    }

    public String getFullNameWithoutMiddle() {
        return firstName + " " + lastName;
    }

    public String getFullNameReversed() {
        return lastName + ", " + firstName + " " + middleInitial;
    }

    public String getFullNameWithoutMiddleReversed() {
        return lastName + ", " + firstName;
    }

}
