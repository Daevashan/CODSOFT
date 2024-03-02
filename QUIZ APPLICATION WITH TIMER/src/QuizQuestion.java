import java.util.List;

public class QuizQuestion {

    private String question;
    private List<String> options;
    private char correctAnswer;

    public QuizQuestion(String question, List<String> options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

}
