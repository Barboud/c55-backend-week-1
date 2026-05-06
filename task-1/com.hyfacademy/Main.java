import service.GradeService;
import util.GradeUtils;
import model.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GradeService service = new GradeService();
        service.run();
        //int[] average = {100,100,100,100,100};
        //double result = GradeUtils.calculateAverage(average);
        //System.out.println(result);
        //System.out.println(GradeUtils.formatGrade(average[0]));

        //Student salem = new Student("Salem");
        //System.out.println(salem.getStudentId());
        //Student Ali = new Student("Ali");
        //System.out.println(Ali.getStudentId());
        //System.out.println(Student.getTotalStudents());
        //System.out.println(Arrays.toString(salem.getGrades()));
        //salem.setGrades(1,60);
        //System.out.println(salem.toString());

    }
}