import service.GradeService;
import util.GradeUtils;

public class Main {
    public static void main(String[] args) {
        //GradeService service = new GradeService();
        // service.run();
        int[] average = {65,78,81,99,86};
        System.out.println(GradeUtils.calculateAverage(average));
    }
}