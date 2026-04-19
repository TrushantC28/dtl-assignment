public class Question {
    private String questionText;
    private String[] options;
    private char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ". " + option);
            optionLabel++;
        }
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}