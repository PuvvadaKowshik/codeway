import java.util.Scanner;

class QuizQuestion {
    private String question;
    private String[] options;
    private int correctAnswerIndex;

    public QuizQuestion(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}

public class QuizApp {
    private static final int QUESTION_COUNT = 2; // Change this to the number of questions in your quiz
    private static final int TIME_LIMIT_SECONDS = 15; // Time limit for each question in seconds

    public static void main(String[] args) {
        QuizQuestion[] questions = new QuizQuestion[QUESTION_COUNT];
        // Define your questions here
        questions[0] = new QuizQuestion("Java is a _____?", new String[]{"A. OOP", "B. POP", "C. Both", "D. none"}, 0);
        questions[1] = new QuizQuestion("which is used to find and fix bugs in java program?", new String[]{"A. JDK", "B. JVM", "C. JRE", "D. JDB"}, 3);

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < QUESTION_COUNT; i++) {
            QuizQuestion currentQuestion = questions[i];
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());
            String[] options = currentQuestion.getOptions();
            for (String option : options) {
                System.out.println(option);
            }

            // Timer
            long startTime = System.currentTimeMillis();
            System.out.println("You have " + TIME_LIMIT_SECONDS + " seconds to answer.");

            // Reading user input
            String chosenOption = scanner.nextLine().toUpperCase();
            long elapsedTime = System.currentTimeMillis() - startTime;

            // Check if time is up
            if (elapsedTime >= TIME_LIMIT_SECONDS * 1000) {
                System.out.println("Time's up!");
                continue;
            }

            int chosenOptionIndex = chosenOption.charAt(0) - 'A';

            if (chosenOptionIndex == currentQuestion.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }

            System.out.println();
        }

        System.out.println("Quiz finished! Your score is: " + score + "/" + QUESTION_COUNT);
    }
}
