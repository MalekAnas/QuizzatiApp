package Engine;


import java.util.ArrayList;
import java.util.Random;

import QuizComponents.*;

public class QuizEngine extends DataManager {

    public String id;
    public ArrayList<QuizResult> resultList = new ArrayList<>();

    Random random = new Random();














    ///Constructors
    public QuizEngine() {
    }

    public QuizEngine(ArrayList<QuizResult> resultList) {
        this.id = String.format("%04d", random.nextInt(10000));
        this.resultList = resultList;
    }











    ///Class actoins
    public void startQuiz(){





    }



    public void addResult(){




    }






    ///Getters


    public String getId() {
        return id;
    }

    public ArrayList<QuizResult> getResultList() {
        return resultList;
    }



    ///Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setResultList(ArrayList<QuizResult> resultList) {
        this.resultList = resultList;
    }
}

