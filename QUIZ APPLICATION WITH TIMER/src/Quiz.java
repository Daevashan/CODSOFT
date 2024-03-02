import java.util.List;

public class Quiz {

    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private int score;

    public QuizTimer getTimer() {
        return timer;
    }

    private QuizTimer timer;

    public Quiz(List<QuizQuestion> questions, int timeLimit) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
        this.timer = new QuizTimer(timeLimit);
    }

    public boolean hasNextQuestion() {
        return currentQuestionIndex < questions.size();
    }

    public QuizQuestion getNextQuestion() {
        return questions.get(currentQuestionIndex++);
    }

    public void submitAnswer(char userAnswer) {
        QuizQuestion currentQuestion = questions.get(currentQuestionIndex - 1);
        if (userAnswer == currentQuestion.getCorrectAnswer()) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

}
