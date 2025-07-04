package controller;
import dto.QuestionDTO;
import service.QuizService;
import java.util.Scanner;

public class QuizController {
    private QuizService service = new QuizService();
    private Scanner sc = new Scanner(System.in);

    private String studentName;
    private String rollNumber;

    public void startQuiz() {
        System.out.println("🎓 Welcome to Java Quiz App!\n");

        // Take Student Details First
        System.out.print("Enter your name: ");
        studentName = sc.nextLine();

        System.out.print("Enter your roll number: ");
        rollNumber = sc.nextLine();

        System.out.println("\n👤 Student Name: " + studentName);
        System.out.println("🆔 Roll Number: " + rollNumber);
        System.out.println("\n📝 Starting your quiz now...\n");

        int questionNumber = 1;
        for (QuestionDTO q : service.getQuestions()) {
            System.out.println("Q" + questionNumber + ". " + q.getQuestionText());
            int optionNumber = 1;
            for (String option : q.getOptions()) {
                System.out.println("  " + optionNumber + ") " + option);
                optionNumber++;
            }

            System.out.print("Your answer (1-4): ");
            int userChoice = sc.nextInt();

            service.checkAnswer(userChoice, q);
            questionNumber++;
            System.out.println();
        }

        System.out.println("✅ Quiz Over!");
        System.out.println("🎯 " + studentName + " (" + rollNumber + "), your final score is: " 
                           + service.getScore() + "/" + service.getQuestions().size());
    }
}
