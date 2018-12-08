package QuizComponents;

import User.Teacher;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Random;

public class Quiz {

    public String id;
    public String subjectId;
    public ArrayList<Question> questionsList = new ArrayList<>();
    public String quizName;
    public String autherId;
    Random random = new Random();


    public Quiz() {
    }

    public Quiz(int id, String subjectId, ArrayList<Question> questionsList, String quizName, String email) {
        this.id = String.format("%04d", random.nextInt(10000));
        this.subjectId = subjectId;
        this.questionsList = questionsList;
        this.quizName = quizName;
        this.autherId = email;
    }







    ///Getters

    public String getId() {
        return id;
    }

    public String getSubjectIdl() {
        return subjectId;
    }

    public ArrayList<Question> getQuestionsList() {
        return questionsList;
    }

    public String getQuizName() {
        return quizName;
    }

    public String getAutherId() {
        return autherId;
    }





    ///Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setSubjectIdl(String subjectIdl) {
        this.subjectId = subjectIdl;
    }

    public void setQuestionsList(ArrayList<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public void setAutherId(String autherId) {
        this.autherId = autherId;
    }
}



