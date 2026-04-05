import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",   1, new double[]{88, 92, 75, 85, 90}));
        students.add(new Student("Bob",     2, new double[]{70, 65, 80, 72, 68}));
        students.add(new Student("Charlie", 3, new double[]{95, 98, 92, 96, 99}));
        students.add(new Student("Diana",   4, new double[]{55, 60, 58, 62, 50}));

        GradeCalculator calculator = new GradeCalculator();
        ReportPrinter    printer   = new ReportPrinter();

        printer.printHeader();
        for (Student s : students) {
            double avg    = calculator.calculateAverage(s.getMarks());
            String letter = calculator.getLetterGrade(avg);
            boolean pass  = calculator.hasPassed(avg);
            printer.printStudentReport(s, avg, letter, pass);
        }
        printer.printFooter(students.size());
    }
}