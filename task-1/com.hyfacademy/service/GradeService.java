package service;

import model.Student;
import util.GradeUtils;
import java.util.Scanner;

public class GradeService {
    private Student[] students = new Student[20];
    private int studentCount = 0;
    private Scanner scanner = new Scanner(System.in);

    public static final int MAX_STUDENTS = 20;

    public void addStudent(){
        if (studentCount == MAX_STUDENTS) {
            System.out.println("Capacity reached.");
        } else {
            System.out.print("Enter the student name: ");
            String name = scanner.nextLine();
            students[studentCount] = new Student(name);
            System.out.println("New Student has been added.");
            System.out.printf("Student %s with Id %s%n",students[studentCount].getName(), students[studentCount].getStudentId());
            System.out.println("══════════════════════════════════════");
            studentCount++;
        }
    }

    public void enterGrades(){
        // prompts the user to select a student by ID, then enter a grade for each of the 5 modules one by one
        System.out.print("Enter the student Id HYF-XXX: ");
        String id = "HYF-" + scanner.nextLine();
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("User not found!");
            return;
        }
        for (int i = 0; i < GradeUtils.MODULE_NAMES.length; i++) {
            boolean isGradeSet = false;
            while (!isGradeSet){
                System.out.printf("Enter grade for %s: ", GradeUtils.MODULE_NAMES[i]);
                int inputGrade = scanner.nextInt();
                scanner.nextLine();
                if (student.setGrades(i, inputGrade)) {
                    isGradeSet= true;
                };
            }

        }
        System.out.printf("Grades for %s with Id %s have been added.%n",student.getName(), student.getStudentId());
        System.out.println(student);
        System.out.println("══════════════════════════════════════");
    }


    public void viewAllStudents(){
        // prints a formatted table of all students (see output format below)
    }

    public void viewStudentReport(){
        // prompts for a student ID and prints a detailed report for that student (see output format below)
    }
    private Student findStudentById(String id) {
        // private helper, returns the matching Student or null
        for (int i = 0; i < studentCount; i++) { // only loop deepens in studentCount not entire array
            if (students[i].getStudentId().equals(id)) {
                return students[i];
            }
        }
        return null;
    }




    public void run(){
        boolean run = true;
        while (run) {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║         HYF ACADEMY — GRADE MGR      ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.println("  1. Add student");
            System.out.println("  2. Enter grades");
            System.out.println("  3. View all students");
            System.out.println("  4. View student report");
            System.out.println("  5. Exit");
            System.out.println("══════════════════════════════════════");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    enterGrades();
                    break;
                case 3:
                    // viewAllStudents();
                    break;
                case 4:
                    // viewStudentReport();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

    }
}