package service;

import model.Student;
import util.GradeUtils;
import java.util.Scanner;

public class GradeService {
    private Student[] students = new Student[20];
    private int studentCount = Student.getTotalStudents();
    private Scanner scanner = new Scanner(System.in);

    public static final int MAX_STUDENTS = 20;

    public void addStudent(){
        //prompts for name and auto-generates the student ID ("HYF-001", "HYF-002", etc.)
    }

    public void enterGrades(){
        // prompts the user to select a student by ID, then enter a grade for each of the 5 modules one by one
    }

    public void viewAllStudents(){
        // prints a formatted table of all students (see output format below)
    }

    public void viewStudentReport(){
        // prompts for a student ID and prints a detailed report for that student (see output format below)
    }
    public String findStudentById(String id) {
        // private helper, returns the matching Student or null
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
                    // addStudent();
                    break;
                case 2:
                    // enterGrades();
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