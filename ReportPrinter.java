// Student.java
public class Student {
private String name;
private int rollNumber;
private double[] marks; // marks for 5 subjects
public Student(String name, int rollNumber, double[] marks) {
this.name = name;
this.rollNumber = rollNumber;
this.marks = marks;
}
public String getName() { return name; }
public int getRollNumber() { return rollNumber; }
public double[] getMarks() { return marks; }
}
// GradeTracker.java — run this file to start the program
import java.util.ArrayList;
import java.util.List;
public class GradeTracker {
public static void main(String[] args) {
// Sample student data (5 subjects each)
List students = new ArrayList<>();
students.add(new Student("Alice", 1, new double[]{88, 92, 75, 85, 90}));
students.add(new Student("Bob", 2, new double[]{70, 65, 80, 72, 68}));
students.add(new Student("Charlie",3, new double[]{95, 98, 92, 96, 99}));
students.add(new Student("Diana", 4, new double[]{55, 60, 58, 62, 50}));
GradeCalculator calculator = new GradeCalculator();
ReportPrinter printer = new ReportPrinter();
printer.printHeader();
for (Student s : students) {
double avg = calculator.calculateAverage(s.getMarks());
String letter = calculator.getLetterGrade(avg);
boolean pass = calculator.hasPassed(avg);
printer.printStudentReport(s, avg, letter, pass);
}
printer.printFooter(students.size());
}
}