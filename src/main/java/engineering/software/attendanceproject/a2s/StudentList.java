package engineering.software.attendanceproject.a2s;


import java.util.ArrayList;


/*

container class of students for attendance

 */

public class StudentList {

    private ArrayList<Student> students;


    // returns true if student was added to list
    // returns false if student was already in list
    public boolean addStudent(Student student) {

        if (students.contains(student)) {
            return false;
        }

        students.add(student);
        return true;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

}
