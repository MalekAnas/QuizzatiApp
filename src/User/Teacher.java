package User;

import java.io.Serializable;

public class Teacher extends User implements Serializable {

    public Teacher(String firstName, String lastName, String eMail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.id = "T" + getId() ;
        this.eMail = eMail;
    }





}