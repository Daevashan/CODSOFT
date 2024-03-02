import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sample quiz questions
        QuizQuestion question1 = new QuizQuestion("What is the capital of France?",
                Arrays.asList("A. Berlin", "B. Paris", "C. London", "D. Rome"), 'B');
        QuizQuestion question2 = new QuizQuestion("Which programming language is used for Android development?",
                Arrays.asList("A. Java", "B. Python", "C. C++", "D. Ruby"), 'A');

        List<QuizQuestion> questions = Arrays.asList(question1, question2);

        // Set time limit for each question (e.g., 20 seconds)
        int timeLimitPerQuestion = 20;

        // Create a quiz instance
        Quiz quiz = new Quiz(questions, timeLimitPerQuestion);

        Scanner scanner = new Scanner(System.in);

        // Start the quiz
        while (quiz.hasNextQuestion()) {
            QuizQuestion currentQuestion = quiz.getNextQuestion();

            // Display question and options
            System.out.println(currentQuestion.getQuestion());
            for (String option : currentQuestion.getOptions()) {
                System.out.println(option);
            }

            // Start the timer
            quiz.getTimer().startTimer();

            // Get user input
            System.out.print("Your answer: ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);

            // Check if time is up
            if (quiz.getTimer().isTimeUp()) {
                System.out.println("Time's up!");
            } else {
                // Submit the answer
                quiz.submitAnswer(userAnswer);
            }
        }

        // Display final score and summary
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + quiz.getScore() + "/" + questions.size());

        // Close the scanner
        scanner.close();
    }
}