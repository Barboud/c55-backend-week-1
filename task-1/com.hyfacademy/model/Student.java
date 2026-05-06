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

    public static int getTotalStudents() {
        return totalStudents;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int moduleIndex, int grade) {
        this.grades = grades;
    }
}