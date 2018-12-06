package User;

import java.io.Serializable;

public class Student extends User implements Serializable {


    public Student(String firstName, String lastName, String password, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = "S" + getId() ;
        this.eMail = eMail;
    }
}

