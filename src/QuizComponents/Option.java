package QuizComponents;

import java.util.Random;

public class Option {


    public String id;
    public String text;
    public boolean correct;
    public String questionId;

    Random random = new Random();

    public Option() {
    }

    public Option(String text, boolean correct, String questionId) {


        this.id = String.format("%04d", random.nextInt(10000));

        this.text = text;
        this.correct = correct;
        this.questionId = questionId;
    }


    ///Getters


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getQuestionId() {
        return questionId;
    }


    ///Setters


    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }


    @Override
    public String toString() {
        return text;
    }
}
