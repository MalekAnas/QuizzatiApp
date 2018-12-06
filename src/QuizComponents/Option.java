package QuizComponents;

public class Option {

    public int id;
    public String text;
    public boolean correct;
    public int questionId;


    public Option() {
    }

    public Option(int id, String text, boolean correct, int questionId) {
        this.id = id;
        this.text = text;
        this.correct = correct;
        this.questionId = questionId;
    }











    ///Getters

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public int getQuestionId() {
        return questionId;
    }




    ///Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}
