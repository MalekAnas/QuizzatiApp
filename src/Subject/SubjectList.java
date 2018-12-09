package Subject;


import Menu.Menu;
import User.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class SubjectList implements Serializable {

    public ArrayList<Subject> subjectsList = new ArrayList<>();
    Menu menu  = new Menu();
    boolean  idAlreadyExist;
    String s;


    //get Subject info
    public void createNewSubject() {

        String subjectName = menu.creatSubjectGetName();




            Subject myNewSubject = new Subject( subjectName);
            subjectsList.add(myNewSubject);
            System.out.println(myNewSubject.getSubjectName() + " has been created!\n" + "Subject Id :" + myNewSubject.getId());
            saveSubjects();




    }


    public void loadSubjects() {
        ObjectInputStream obj = null;
        try {
            obj = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Subjects.dat"));

            subjectsList = (ArrayList<Subject>) obj.readObject();
            obj.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println(subjectsList.size() + " Subjects Loaded\n---------------------");
    }



    public void saveSubjects() {
        ObjectOutputStream obj;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Subjects.dat"));
            obj.writeObject(subjectsList);
//            obj.flush();
            obj.close();
            System.out.println("Subjects data saved!");
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println(e1.getMessage());
        }
    }


    public Subject findSubjectById(String Id){

        Subject foundSub = null;
        for (Subject sub : subjectsList) {
            if (Id.equals(sub.getId()))
                foundSub=sub;
            else
                System.out.println("Subject not found!");

        }

        return foundSub;
    }

    public void viewSubjects(){

        loadSubjects();
        for (Subject subToView :
                subjectsList) {
          System.out.println(subToView.toString());

        }


    }

    public boolean checkIfSubjectExist(String newSubjectId) {
        boolean isExist = false;
        for (Subject mySubject : subjectsList) {

            if (mySubject.getId().equals(newSubjectId)) {
                isExist = true;
            } else
                isExist = false;

        }

        return isExist;
    }
}
