package QuizComponents;


import Subject.Subject;

import java.util.ArrayList;
import java.util.Random;

public class Question {
    public String id;
    public String text;
    public ArrayList<Option> optionList = new ArrayList<>();
    public Subject subject;
    public  int quizId;

    Random random = new Random();

    public Question() {
    }


    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public Question(String text, ArrayList<Option> optionList, Subject subject) {
        this.id = String.format("%04d", random.nextInt(10000));
        this.text = text;
        this.optionList = optionList;
        this.subject = subject;
    }









    ///Getters


    public String getId() {
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

