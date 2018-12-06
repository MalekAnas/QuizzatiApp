package QuizComponents;

import java.util.ArrayList;

public class Quiz {

    public int id;
    public int subjectId;
    public ArrayList<Question> questionsList = new ArrayList<>();
    public String quizName;
    public int autherId;


    public Quiz() {
    }

    public Quiz(int id, int subjectId, ArrayList<Question> questionsList, String quizName, int autherId) {
        this.id = id;
        this.subjectId = subjectId;
        this.questionsList = questionsList;
        this.quizName = quizName;
        this.autherId = autherId;
    }







    ///Getters

    public int getId() {
        return id;
    }

    public int getSubjectIdl() {
        return subjectId;
    }

    public ArrayList<Question> getQuestionsList() {
        return questionsList;
    }

    public String getQuizName() {
        return quizName;
    }

    public int getAutherId() {
        return autherId;
    }





    ///Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setSubjectIdl(int subjectIdl) {
        this.subjectId = subjectIdl;
    }

    public void setQuestionsList(ArrayList<Question> questionsList) {
        this.questionsList = questionsList;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public void setAutherId(int autherId) {
        this.autherId = autherId;
    }
}



