package User;

import java.io.Serializable;

public class Teacher extends User implements Serializable {

    public Teacher(String firstName, String lastName, String password, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = "T" + getId() ;
        this.eMail = eMail;
    }





}