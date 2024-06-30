//create school management system:about teacher,student and funds
//money management system for school
//keep track of student total fees
//fees already paid
//teachers salary
//school contains: teacher,student,total money earned ,total money spent on teacher's salary

//teacher details: name,id,salary
//student details: name,id,grade,fees paid,fees total


package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create lists to store teachers and students
        List<Teacher> teachersList = new ArrayList<>();
        List<Student> studentsList = new ArrayList<>();

        // Input teachers
        System.out.println("Enter number of teachers:");
        int numTeachers = scanner.nextInt();
        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Enter teacher"+(i+1)+ "ID:");
            int id = scanner.nextInt();
            System.out.println("Enter teacher name:");
            String name = scanner.next();
            System.out.println("Enter teacher salary:");
            int salary = scanner.nextInt();
            teachersList.add(new Teacher(id, name, salary));
        }

        // Input students
        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();
            System.out.println("Enter student name:");
            String name = scanner.next();
            System.out.println("Enter student grade:");
            int grade = scanner.nextInt();
            studentsList.add(new Student(id, name, grade));
        }

        // Create a school object
        School ghs = new School(teachersList, studentsList);
        System.out.println("Total money earned by school initially: " + School.getTotalMoneyEarned());

        // Update fees paid by students
        for (Student student : studentsList) {
            System.out.println("Enter fees paid by " + student.getName() + ":");
            int feesPaid = scanner.nextInt();
            student.updatefeePaid(feesPaid);
            System.out.println("Remaining fees of " + student.getName() + ": " + student.getRemainingFees());
        }

        System.out.println("Total money earned by school: " + School.getTotalMoneyEarned());

        System.out.println("----Making SCHOOL PAY SALARY----");

        // Pay salary to teachers
        for (Teacher teacher : teachersList) {
            teacher.receivedSalary(teacher.getSalary());
            System.out.println("GHS has spent for salary to " + teacher.getName() + " and now has $" + School.getTotalMoneyEarned());
        }

        scanner.close();
    }
}
