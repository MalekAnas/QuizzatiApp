package Subject;

public class Subject {

    public int id;
    public String subjectName;



    public Subject() {
    }

    public Subject(int id, String subjectName) {
        this.id = id ;
        this.subjectName = subjectName;
    }
















    ///Getters


    public int getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }





    ///Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
