import model.Student;
import service.GradeService;

public class Main {
    public static void main(String[] args) {
        //Student ali = new Student("Ali");
        //Student nasser = new Student("Nasser");
        //Student jamal = new Student("Jamal");
        GradeService service = new GradeService();
        service.run();
    }
}