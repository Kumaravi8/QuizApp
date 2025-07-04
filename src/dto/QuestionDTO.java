package dto;


import java.util.List;

public class QuestionDTO {
    private String questionText;
    private List<String> options;
    private int correctOption; // 1-based index

    public QuestionDTO(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

