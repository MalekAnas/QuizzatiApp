package Subject;

import java.io.Serializable;
import java.util.Random;

public class Subject implements Serializable {

    public String id;
    public String subjectName;
    Random random = new Random();



    public Subject() {
    }

    public Subject( String subjectName) {
        this.id = String.format("%04d", random.nextInt(10000));
        this.subjectName = subjectName;
    }


    ///Getters


    public String getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }





    ///Setters



    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }




    //To string methods
    @Override
    public String toString() {
        return "Subject name: " + subjectName + "\n" + "Subject ID: " + id;
    }

}
