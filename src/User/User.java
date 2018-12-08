package User;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {

    public String firstName;
    public String lastName;
    protected String password;
    private UUID uniqueID = UUID.randomUUID();
    public String id = String.valueOf(uniqueID);
    public String eMail;


    public User() {
    }

    public User(String firstName, String lastName, String password, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.id = String.valueOf(UUID.randomUUID());
        this.eMail = eMail;
    }

    ///Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String geteMail() {
        return eMail;
    }


    ///Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void seteMail(String eMail) {
        this.eMail = eMail;
    }


    ///ToString Method to show basic info of the User
    public String printBasicInfo() {
        return "\t\t\t\t\t\tUser info\n" + "Name: " + firstName + " " + "\n" +"Last Name: "+lastName+ "\n" +
                "ID : " + id + "\n" + "Email: " + ":" + eMail + "\n" + "Password: " + password ;

    }
}
