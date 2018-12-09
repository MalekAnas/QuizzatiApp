package QuizComponents;


import java.util.ArrayList;
import java.util.Random;

public class Quiz {

    public String id;
    public String subjectId;

    Question [] questionsList;
    public String autherId;
    Random random = new Random();


    public Quiz() {
    }

    public Quiz( String subjectId, Question [] questionsList,  String email) {
        this.id = String.format("%04d", random.nextInt(10000));
        this.subjectId = subjectId;
        this.questionsList = questionsList;
        this.autherId = email;
    }







    ///Getters

    public String getId() {
        return id;
    }

    public String getSubjectIdl() {
        return subjectId;
    }

    public Question[] getQuestionsList() {
        return questionsList;
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

    public void setQuestionsList(Question[] questionsList) {
        this.questionsList = questionsList;
    }

    public void setAutherId(String autherId) {
        this.autherId = autherId;
    }
}



