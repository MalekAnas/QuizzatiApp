package Subject;


import java.util.ArrayList;
import java.util.Scanner;

public class SubjectList {

    public ArrayList<Subject> subjectsList = new ArrayList<>();
    Scanner readIn = new Scanner(System.in);


    //get Subject info
    public Subject getSubjectInfo() {
        Subject myNewSubject = new Subject();
        System.out.println("Enter the Subject name:");
        String SubjectName = readIn.nextLine();

        System.out.println("Enter a unique uniqueID for this Subject(Numbers only): ");
        int subjectID = Integer.parseInt(readIn.nextLine());
        boolean idAlreadyExist = checkSubject(myNewSubject.id);

        if (idAlreadyExist) {
            System.out.println("This uniqueID is already taken!");
        } else if (idAlreadyExist == false) {
            myNewSubject.id = subjectID;
            myNewSubject.subjectName = SubjectName;
        }
        return myNewSubject;
    }


    public void addNewSubject(Subject newSubject) {
        Subject theNewSubject = getSubjectInfo();
        subjectsList.add(theNewSubject);


    }


    private boolean checkSubject(int newSubjectId) {
        boolean isExist = false;
        for (Subject mySubject : subjectsList) {

            if (mySubject.getId() == newSubjectId) {
                isExist = true;
            } else
                isExist = false;

        }

        return isExist;
    }
}
