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


    //get Subject info
    public void createNewSubject() {

        String subjectName = menu.creatSubjectGetName();
        String subjectID = menu.creatSubjectGetId();
        idAlreadyExist = checkIfSubjectExist(subjectID);


        if (idAlreadyExist) {
            System.out.println("This ID is already taken!");

        } else if (!idAlreadyExist) {
            Subject myNewSubject = new Subject(subjectID, subjectName);
            subjectsList.add(myNewSubject);
            saveSubjects();


        }

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

        System.out.println(subjectsList.size() + " Loaded");
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
