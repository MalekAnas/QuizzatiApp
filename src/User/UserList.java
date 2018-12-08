package User;

import java.io.*;
import java.util.ArrayList;
import Exception.*;

public class UserList implements Serializable {

    /////////////////////////////////////////////////////
    public ArrayList<User> UsersList = new ArrayList<>();
    public UserType typeOfUser;
    User theUser;
    boolean isExist;
    public enum UserType{ Student , Teacher}




    //check if email is already exist in the userlist
    public boolean isEmailExist(String email){

        for (User user : UsersList) {
            if (user.geteMail().equals(email)){
                isExist = true;
            }
            else isExist=false;

        }
        return isExist;
    }




    //Sign Up new user
    public void signUpNewUser(String firstName , String lastName, String email, String password , UserType type ){
        User newUser = new User();
        if (typeOfUser.equals(UserType.Student)){
            newUser = new Student(firstName, lastName, email, password);
        }
        else if (typeOfUser.equals(UserType.Teacher)){
            newUser = new Teacher(firstName, lastName, email, password);
        }

        UsersList.add(newUser);
        saveUsers();
        System.out.println("Welcome " + newUser.getFirstName() + "!");

    }



    //Sign In a user

    public boolean signIn (String email, String password){
        boolean loggedIn =false;
        loadUsers();
        isExist = isEmailExist(email);
        if (isExist) {
            try {
                theUser = findUserByMail(email);


                for (User user :
                        UsersList) {


                    if (email.equals(theUser.geteMail())) {
                        if (password.equals(theUser.getPassword())) {
                            loggedIn = true;
                        } else if (!password.equals(theUser.getPassword())){
                            loggedIn = false;
                            System.out.println("you entered wrong password!");
                        }
                    } else {
                        System.out.println("You entered wrong email!");
                    }



                }

            } catch (UserNotFound e) {
            }

        }
        return loggedIn;


    }





    //add the user to list
    public void addUser(User user) throws UserIsAlreadyExist {


        isExist = isEmailExist(user.geteMail());

        if (isExist) {
            throw new UserIsAlreadyExist("User is already exist.");
        } else if (!isExist) {
            UsersList.add(user);
            System.out.println("Welcome " + user.firstName + " !");
        }
    }


    public User findUserByMail(String userToFindEmail) throws UserNotFound{

        for (User userToFind : UsersList) {
            if (userToFindEmail.equals(userToFind.geteMail())) {
                theUser = userToFind;
            }
            else throw new UserNotFound("User is not registered!");

        }

        return theUser;

    }




    //select user type when login
    public UserType userTypeLogin(User userToLogin) {
        if (userToLogin instanceof Teacher) {
            typeOfUser = UserType.Teacher;
        }
        else if (userToLogin instanceof Student) {
            typeOfUser = UserType.Student;
        }
        return typeOfUser;
    }




    ///////


    public void removeUser(String userToRemoveMail) throws UserNotFound {

        for (User userToRemove : UsersList) {
            while(userToRemove.geteMail().equals(userToRemoveMail)){
                isExist = true;
            }

        }
        if (isExist) {
            UsersList.remove(findUserByMail(userToRemoveMail));
        } else {
            throw new UserNotFound("Usere is not exist!");

        }
    }




    public void logInCheck(String email, String password){

    }


    //Save new Users to Users.dat
    public void saveUsers() {
        ObjectOutputStream obj;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Users.dat"));
            obj.writeObject(UsersList);
//            obj.flush();
            obj.close();
            System.out.println("Users data saved!");
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println(e1.getMessage());
        }
    }


    //load Users from Users.dat

    public void loadUsers() {
        ObjectInputStream obj = null;
        try {
            obj = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\QuizzatiApp\\src\\DataFiles\\Users.dat"));

            UsersList = (ArrayList<User>) obj.readObject();
            obj.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println(UsersList.size() + " Loaded");
    }

    @Override
    public String toString() {

        String userInfo = "";
        for (User myUser : UsersList) {
            System.out.println(myUser.printBasicInfo());

        }


        return userInfo;
    }
}

