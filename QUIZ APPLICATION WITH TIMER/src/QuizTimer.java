public class QuizTimer {

    private int timeLimit; // in seconds
    private long startTime;

    public QuizTimer(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public boolean isTimeUp() {
        long elapsedTime = System.currentTimeMillis() - startTime;
        return elapsedTime >= timeLimit * 1000;
    }

}
