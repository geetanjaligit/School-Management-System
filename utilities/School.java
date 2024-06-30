
//This is a simple School Management System which manages basic structure of school like Teacher,Student and funds.
//This is just an application of OOP's concept in java

package utilities;
import java.util.ArrayList;
import java.util.List;
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
     
  School(List<Teacher> teachers, List<Student> students) {
     
    this.teachers = teachers;
    this.students = students;
    this.totalMoneyEarned = 0;
    this.totalMoneySpent = 0;
     
  }

    /**
     * @return List<Teacher> return the teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param teachers the teachers to set
     */
    public void updateTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     * @return List<Student> return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void updateStudents(Student student) {
        this.students.add(student);
    }

    /**
     * @return int return the totalMoneyEarned
     */
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @param totalMoneyEarned the totalMoneyEarned to set
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * @return int return the totalMoneySpent
     */
    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * @param totalMoneySpent the totalMoneySpent to set
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
        
    }

}