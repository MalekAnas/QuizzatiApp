package Menu;




import java.util.Scanner;

public class Menu {

    Scanner readIn = new Scanner(System.in);

    public static void main(String[] args) {


        Menu menu = new Menu();
        menu.printFirstMenu();
        menu.printSignedUserMenu();
        menu.printStartQuizMenu();
    }

    //Printing Methods


    ///Printing the header for the first time
    public void printFirstMenu() {
        System.out.println("+------------------------------------------------+");
        System.out.println("|           <<Hello to Quizzati App>>            |");
        System.out.println("|  Here is an awesome app to test your knowledg  |");
        System.out.println("|        in many subjects in a simple way        |");
        System.out.println("+------------------------------------------------+\n\n");
        System.out.println("1) Sign Up.");
        System.out.println("2) Sign In.");
        System.out.println("3) Veiw highScores.\n");
        System.out.println("--------------------------------------------------------\n\n");


    }

    //this method shoud be called after every succesful choice to inform the user about what he did.
    public void informActionDone(String x) {

        System.out.println("You have chosen " + x);
        System.out.println("--------------------------------------------------------\n\n");


    }

    //Choose between Student or Teacher
    public int selectUserType() {
        System.out.println("1) As teacher.");
        System.out.println("2) As student.");
        System.out.println("--------------------------------------------------------\n\n");
        System.out.println("Your choice here: ");
        int choice = Integer.parseInt(readIn.nextLine());
        return choice;
    }

//    //Get user choice
//    public int getUserChoice(){
//        int choice = Integer.parseInt(readIn.nextLine());
//        return choice;
//    }


    //print signIn email request menu
    public String printSignInMailMenu() {
        System.out.println("Enter your E-mail:\n");
        System.out.println("--------------------------------------------------------\n");
        String email = readIn.nextLine();
        System.out.println("--------------------------------------------------------");
        return email;
    }

    //print signIn password request menu
    public String printSingInPasswordMenu() {
        System.out.println("Enter your Password:\n");
        System.out.println("--------------------------------------------------------\n");
        String password = readIn.nextLine();
        System.out.println("--------------------------------------------------------");
        return password;
    }


    //printing signed In Users' menu
    public void printSignedUserMenu() {
        System.out.println("1) Veiw Subjects.");
        System.out.println("2) Start a quiz.");
        System.out.println("3) Veiw my score.");
        System.out.println("--------------------------------------------------------\n\n");

    }


    //print SignUp menu
    public String signUpGetFirstName() {

        System.out.println("Enter your first name:");
        String fName = readIn.nextLine();
        return fName;

    }

    //////
    public String signUpGetLastName() {
        System.out.println("Enter your last name:");
        String lName = readIn.nextLine();
        return lName;

    }

    //////
    public String signUpGetEmail() {
        System.out.println("Enter your E-mail:");

        String email = readIn.nextLine();


        return email;

    }

    /////
    public String signUpGetPassword() {
        System.out.println("Enter a password:");
        String password = readIn.nextLine();
        return password;
    }


    //Print Start Quiz Menu
    public void printStartQuizMenu() {


        System.out.println("");
    }
}

