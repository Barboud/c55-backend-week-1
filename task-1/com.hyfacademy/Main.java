import service.GradeService;
import util.GradeUtils;

public class Main {
    public static void main(String[] args) {
        //GradeService service = new GradeService();
        // service.run();
        int[] average = {5,55,26,25,10};
        double result = GradeUtils.calculateAverage(average);
        System.out.println(result);
        System.out.println(GradeUtils.isPassing(result));
        System.out.println(GradeUtils.isModulePassing(average[2]));
        System.out.println(GradeUtils.getLetterGrade(average[0]));
        System.out.println(GradeUtils.formatGrade(average[0]));



    }
}