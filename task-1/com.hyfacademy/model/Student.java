package model;

import util.GradeUtils;

public class Student {
    private String name;
    private String studentId;
    private int[] grades = new int[5];
    public static int totalStudents;

    public Student(String name) {
        this.name = name;
        this.studentId = generateStudentId();
        this.grades = new int[]{0, 0, 0, 0, 0};
        totalStudents++;
    }

    private String generateStudentId(){
        int id = totalStudents + 1;
        if (id >= 100) {
            return "HYF-" + id;
        } else if (id >= 10) {
            return "HYF-0" + id;
        } else {
            return "HYF-00" + id;
        }
    }

    public String getStudentId(){
        return this.studentId;
    }

    public String getName(){
        return this.name;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public int[] getGrades() {
        return grades;
    }

    public boolean setGrades(int moduleIndex, int grade) {
        // validates that moduleIndex is between 0–4 and grade is between 0–100; prints an error message and does nothing if invalid
        if (moduleIndex > 4) {
            System.out.println("moduleIndex must be between 0–4");
            return false;
        } else if (grade > 100) {
            System.out.println("Grade must be between 0–100");
            return false;
        }
        this.grades[moduleIndex] = grade;
        return true;
    }


    public String toString(){
        // returns a single-line summary: "[HYF-001] Alice — Avg: 72.40 — PASS"
        double average = GradeUtils.calculateAverage(this.grades);
        String pass = "PASS";
        if (!GradeUtils.isPassing(average)) {
            pass = "FAIL";
        }
        String name = getName();
        String studentId = getStudentId();
        return "[" + studentId + "] " + name + " — Avg: " + average + " — " + pass;
    }
}