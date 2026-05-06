package util;

public class GradeUtils {
    public static final int MODULE_PASS_MARK = 55;
    public static final double TRACK_PASS_AVERAGE = 60.0;
    public static final int MODULE_COUNT = 5;
    public static final String[] MODULE_NAMES = {"Java Basics", "Control Flow", "OOP Fundamentals", "Arrays & Collections", "Input & Output"};

    // to prevent instantiation,
    private GradeUtils(){}

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public static boolean isPassing(double average){
        // returns true if average is ≥ TRACK_PASS_AVERAGE
        return true;
    }

    public static boolean isModulePassing(int grade) {
        // returns `true` if grade ≥ `MODULE_PASS_MARK`
        return true;
    }

    public static char getLetterGrade(double average){
        // returns a letter grade:
        // 90–100 → `"A"`, 80–89 → `"B"`, 70–79 → `"C"`, 60–69 → `"D"`, below 60 → `"F"`
        return 'a';
    }

    public static String formatGrade(int grade) {
        // returns the grade as a right-aligned 3-character string (e.g. `" 87"`, `"100"`)
        return "100";
    }


}