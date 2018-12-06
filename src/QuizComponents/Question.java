package QuizComponents;


import java.util.ArrayList;

public class Question {
    public int id;
    public String text;
    public ArrayList<Option> optionList = new ArrayList<>();
    public  int quizId;


    public Question() {
    }


    public Question(int id, String text, ArrayList<Option> optionList, int quizId) {
        this.id = id;
        this.text = text;
        this.optionList = optionList;
        this.quizId = quizId;
    }









    ///Getters


    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Option> getOptionList() {
        return optionList;
    }

    public int getQuizId() {
        return quizId;
    }


    ///Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOptionList(ArrayList<Option> optionList) {
        this.optionList = optionList;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }


}

