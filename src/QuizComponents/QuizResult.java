package QuizComponents;

import java.util.Calendar;

public class QuizResult {

    public int id;
    public int userId;
    public int quizId;
    public String date;
    public int correctQuestions;

    Calendar calendar = Calendar.getInstance();

    public QuizResult() {
    }

    public QuizResult(int id, int userId, int quizId, String date, int correctQuestions) {
        this.id = id;
        this.userId = userId;
        this.quizId = quizId;
        this.date = String.valueOf(calendar.getTime());
        this.correctQuestions = correctQuestions;
    }












    ///Getters


    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getQuizId() {
        return quizId;
    }

    public String getDate() {
        return date;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }





    ///Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }
}


