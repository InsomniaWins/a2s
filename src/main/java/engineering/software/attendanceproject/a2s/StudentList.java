package engineering.software.attendanceproject.a2s;


import java.util.ArrayList;
import java.util.Comparator;


/*

container class of students for attendance

 */

public class StudentList {

    private static ArrayList<Student> students = new ArrayList<>();


    // returns true if student was added to list
    // returns false if student was already in list
    public static boolean addStudent(Student student) {

        if (students.contains(student)) {
            return false;
        }

        students.add(student);
        return true;
    }


    /*

        sorts students alphabetically

     */
    public static void sortStudents() {
        students.sort(Comparator.comparing(Student::getLastName));
    }

    /*
    returns student if found one with studentId, otherwise returns null
     */
    public static Student getStudentFromStudentId(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<Student> getStudents()
    {
        return students;
    }

}
