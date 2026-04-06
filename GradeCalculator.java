public class GradeCalculator {
    public double calculateAverage(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public String getLetterGrade(double average) {
        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        return "F";
    }

    public boolean hasPassed(double average) {
        return average >= 50;
    }
}
