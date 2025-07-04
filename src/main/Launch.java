package main;
import controller.QuizController;

public class Launch {
    public static void main(String[] args) {
        QuizController controller = new QuizController();
        controller.startQuiz();
    }
}
