package QuizComponents;

import Subject.*;

import java.io.*;
import java.util.ArrayList;


public class QuestionsList implements Serializable {
    boolean isExist;
    Subject mySubject;
    Question newQuestion;
    SubjectList subjects = new SubjectList();
    public ArrayList<Question> questions = new ArrayList<>();

    public void saveQuestions() {
        ObjectOutputStream obj;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Questions.dat"));
            obj.writeObject(questions);
//            obj.flush();
            obj.close();
            System.out.println("Questions data saved!");
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println(e1.getMessage());
        }
    }


    public void loadQuestions() {
        ObjectInputStream obj = null;
        try {
            obj = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Questions.dat"));

            questions = (ArrayList<Question>) obj.readObject();
            obj.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println(questions.size() + " Loaded");
    }
























}
