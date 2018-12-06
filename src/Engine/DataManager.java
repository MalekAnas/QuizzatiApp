package Engine;

import java.util.ArrayList;
import java.util.Scanner;
import Menu.*;
import QuizComponents.*;
import Subject.*;
import User.*;
import Exception.*;

public class DataManager {


    static Scanner readIn = new Scanner(System.in);
    ArrayList<Quiz> quizList = new ArrayList<>();
    ArrayList<Subject> subjectList = new ArrayList<>();
    static UserList allUsers = new UserList();
    static Menu menu = new Menu();
    static User user;
    static DataManager quizzati = new DataManager();


    boolean exist;

    public static void main(String[] args) {




        allUsers.loadUsers();
        allUsers.toString();

        menu.printFirstMenu();
        quizzati.performAction(quizzati.getUserChoice());






    }


    private void performAction(int choice) {

        switch (choice) {

            case 1:
                try {
                    signUp();
                }catch (UserIsAlreadyExist e){
                }
                menu.printFirstMenu();
                quizzati.performAction(getUserChoice());



                break;
            case 2:
                signIn();



                break;
            case 3:
                break;
            default:
                break;


        }


    }


    public static int getUserChoice() {


        System.out.println("Your choice Here:");
        try {
            int userChoic;
            userChoic = Integer.parseInt(readIn.nextLine());
            return userChoic;
        } catch (NumberFormatException e) {
            System.out.println("Ops! your choice should be a number!\nPlease try again!");
        }
        menu.printFirstMenu();
        quizzati.performAction(getUserChoice());
        return 0;
    }

    public static void viewSubjects() {

    }

    public static void viewQuiz() {

    }

    protected static void loadData() {

    }

    protected static void SaveData() {

    }

    public void signIn (){

        String email = menu.printSignInMailMenu();
        String password = menu.printSingInPasswordMenu();
        boolean logged = allUsers.signIn(email, password);
        if (logged) {
            menu.printSignedUserMenu();
        }
        else
            System.out.println("Failed to login!");
    }



    public void signUp() throws UserIsAlreadyExist {

        String firstName, lastName, email, password;
        int userType = menu.selectUserType();
        if (userType == 1)
            allUsers.typeOfUser = UserList.UserType.Teacher;
        else if (userType ==2 )
            allUsers.typeOfUser = UserList.UserType.Student;


        firstName = menu.signUpGetFirstName();
        lastName = menu.signUpGetLastName();
        email = menu.signUpGetEmail();
        password = menu.signUpGetPassword();
        System.out.println(password);





        if (!allUsers.isEmailExist(email)) {
            allUsers.signUpNewUser(firstName, lastName, email, password, allUsers.typeOfUser);
        } else if (allUsers.isEmailExist(email)) {

            throw new UserIsAlreadyExist(email + " is already exist!");
        }
        menu.printFirstMenu();
        quizzati.performAction(getUserChoice());
    }




    public void viewUsers() {

        allUsers.toString();

    }


    ///Getter and setters


    public ArrayList<Quiz> getQuizList() {
        return quizList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }


    ///Setters Here//


    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }


    public void selectUserTypeSignIn() {

    }
}
