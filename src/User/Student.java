package User;

import java.io.Serializable;

public class Student extends User implements Serializable {


    public Student(String firstName, String lastName, String eMail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.id = "S" + getId() ;
        this.eMail = eMail;
    }
}

