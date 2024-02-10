package Regex;

public class UserException extends Exception{
    public String message;
    public UserException(){
        super("Invalid Name");
    }
    public UserException(String message){
        super(message);
    }

}
