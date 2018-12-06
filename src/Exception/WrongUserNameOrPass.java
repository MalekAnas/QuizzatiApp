package Exception;

public class WrongUserNameOrPass extends Exception {
    public WrongUserNameOrPass() {
    }
    public WrongUserNameOrPass(String msg){super(msg);}
}