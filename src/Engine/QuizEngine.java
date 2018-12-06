package Engine;


import java.util.ArrayList;
import QuizComponents.*;

public class QuizEngine extends DataManager {

    public int id;
    public ArrayList<QuizResult> resultList = new ArrayList<>();














    ///Constructors
    public QuizEngine() {
    }

    public QuizEngine(int id, ArrayList<QuizResult> resultList) {
        this.id = id;
        this.resultList = resultList;
    }









    ///Class actoins
    public void startQuiz(){



    }



    public void addResult(){




    }






    ///Getters


    public int getId() {
        return id;
    }

    public ArrayList<QuizResult> getResultList() {
        return resultList;
    }



    ///Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setResultList(ArrayList<QuizResult> resultList) {
        this.resultList = resultList;
    }
}

