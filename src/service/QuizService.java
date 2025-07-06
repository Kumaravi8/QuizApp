package service;

import dto.QuestionDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class QuizService {
    private List<QuestionDTO> questions = new ArrayList<>();
    private int score = 0;

    public QuizService() {
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new QuestionDTO(
            "Which of the following is not a feature of Java?",
            List.of("Object Oriented", "Platform Dependent", "Robust", "Secure"),
            2
        ));
        questions.add(new QuestionDTO(
            "Which of the following classes is immutable?",
            List.of("String", "StringBuilder", "StringBuffer", "ArrayList"),
            1
        ));
        questions.add(new QuestionDTO(
            "Which interface provides key-value pair storage?",
            List.of("List", "Set", "Map", "Queue"),
            3
        ));
        questions.add(new QuestionDTO(
            "What is the default value of a local variable in Java?",
            List.of("null", "0", "Depends on type", "No default value"),
            4
        ));
        questions.add(new QuestionDTO(
            "Which method is used to get the length of a string?",
            List.of("length()", "size()", "getLength()", "count()"),
            1
        ));
        questions.add(new QuestionDTO(
            "Which keyword is used for exception handling?",
            List.of("try", "catch", "finally", "All of the above"),
            4
        ));
        questions.add(new QuestionDTO(
            "Which of these is not a valid Collection?",
            List.of("HashSet", "ArrayList", "TreeMap", "VectorMap"),
            4
        ));
        questions.add(new QuestionDTO(
            "Which loop is best when number of iterations is known?",
            List.of("while", "do-while", "for", "foreach"),
            3
        ));
        questions.add(new QuestionDTO(
            "How can you create a thread in Java?",
            List.of("Extend Thread", "Implement Runnable", "Use ExecutorService", "All of the above"),
            4
        ));
        questions.add(new QuestionDTO(
            "What is the size of int data type?",
            List.of("4 bytes", "2 bytes", "8 bytes", "Depends on OS"),
            1
        ));

        // Optional: Shuffle questions
        Collections.shuffle(questions);
    }

    public List<QuestionDTO> getQuestions() {
        return questions;
    }

    public void checkAnswer(int userChoice, QuestionDTO q) {
        if (userChoice == q.getCorrectOption()) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }
}
