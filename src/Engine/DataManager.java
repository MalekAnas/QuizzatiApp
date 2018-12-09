package Engine;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Menu.*;
import QuizComponents.*;
import Subject.*;
import User.*;
import Exception.*;

public class DataManager {


    static Scanner readIn = new Scanner(System.in);
    ArrayList<Quiz> quizList = new ArrayList<>();
    static SubjectList subjects = new SubjectList();
    static UserList allUsers = new UserList();
    static Option option;
    Random random = new Random();

    static Question newQuestion;


    static QuestionsList questionsList = new QuestionsList();
    static Menu menu = new Menu();
    static User user;
    static DataManager quizzati = new DataManager();
    static ArrayList<Option> options = new ArrayList<>();

    static Subject subjectOfQuestion;

    boolean correct;
    private boolean isExist;

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
                } catch (UserIsAlreadyExist e) {
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
                System.exit(0);
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

        subjects.viewSubjects();

    }




    public void signIn() {

        String email = menu.printSignInMailMenu();
        String password = menu.printSingInPasswordMenu();
        boolean logged = allUsers.signIn(email, password);

        if (logged) {


            try {
                user = allUsers.findUserByMail(email);


            } catch (UserNotFound e) {
                System.out.println("wrong here");
            }
            if (user instanceof Teacher) {
                menu.printSignedTeacherMenu();
                quizzati.performTeacherAction(getUserChoice());
                performTeacherAction(getUserChoice());
            } else if (user instanceof Student) {


                viewSubjects();
                quizzati.performStudentAction(getUserChoice());
            }
        } else if (!logged) {
            System.out.println("Failed to login!");
            quizzati.signIn();

        }
    }

    private void performTeacherAction(int teacherChoice) {
        switch (teacherChoice) {

            case 1:

                subjects.createNewSubject();
                subjects.viewSubjects();
                menu.printSignedTeacherMenu();
                quizzati.performTeacherAction(getUserChoice());


                break;
            case 2:
                subjects.viewSubjects();

                quizzati.addQuestion();


                break;
            case 3:
                break;
            default:
                break;


        }
    }

    private void addQuestion() {


        System.out.println("Enter subject ID: ");
        String subID = readIn.nextLine();
        isExist = subjects.checkIfSubjectExist(subID);
        if (isExist)
            subjectOfQuestion = subjects.findSubjectById(subID);


        newQuestion = new Question();


        System.out.println("Enter the question's text: ");

        String questionText = readIn.nextLine();


        String optionTxt;
        System.out.println("Enter options:");
        for (int i = 1; i < 5; i++) {
            System.out.println("Option " + i + ":");
            optionTxt = readIn.nextLine();
            System.out.println("Enter 1 if this option is the correct answer, 0 if false: ");
            int choice = Integer.parseInt(readIn.nextLine());
            if (choice == 1) {
                correct = true;
                System.out.println("correct");
            }
            if (choice == 0)
                correct = false;


            options.add(new Option(optionTxt, correct, newQuestion.getId()));

        }

        newQuestion.setText(questionText);
        newQuestion.setOptionList(options);
        newQuestion.setSubjectID(subID);

        questionsList.questions.add(newQuestion);
        System.out.println("Question added successfully!");
        menu.printSignedTeacherMenu();
        quizzati.performTeacherAction(getUserChoice());


    }

    private void performStudentAction(int studentChoice) {
        ArrayList<Question> tempArray = new ArrayList<>();
        String subjectID = String.valueOf(studentChoice);
        tempArray=  questionsList.pickQuestionsBySubject(subjectID);

        menu.printTwoQuizesTypes();
        int choice = getUserChoice();
        switch (choice){
            case 1:

            Question [] fiveQuesQuiz = new Question[5];
            for(int i = 0; i < tempArray.size(); i++){
                boolean exist = false;
                while(!exist){
                    int f = random.nextInt(tempArray.size());
                    Question tempQuestion = tempArray.get(f);
                    for(int j = 0; j < i; j++){
                        if(fiveQuesQuiz[j].id == tempQuestion.id){
                            exist = true;
                            break;
                        } 	
                    }
                    if(!exist){
                        fiveQuesQuiz[i] == tempQuestion;
                    }
                }

            }

                break;
            case 2:
                break;
        }


    }


    public void signUp() throws UserIsAlreadyExist {

        String firstName, lastName, email, password;
        int userType = menu.selectUserType();
        if (userType == 1)
            allUsers.typeOfUser = UserList.UserType.Teacher;
        else if (userType == 2)
            allUsers.typeOfUser = UserList.UserType.Student;


        firstName = menu.signUpGetFirstName();
        lastName = menu.signUpGetLastName();
        email = menu.signUpGetEmail();
        if (allUsers.isEmailExist(email)) {

            System.out.println(email + " is already exist!\nTry to signIn.");
            throw new UserIsAlreadyExist(email + " is already exist!");
        }
        password = menu.signUpGetPassword();
        System.out.println(password);


        if (!allUsers.isEmailExist(email)) {
            allUsers.signUpNewUser(firstName, lastName, email, password, allUsers.typeOfUser);
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
        return subjects.subjectsList;
    }


    ///Setters Here//


    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjects.subjectsList = subjectList;
    }



}
