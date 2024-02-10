package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    public String name;
    public JavaRegex(String name){
        this.name=name;
    }
    public void nameChecker() throws UserException{
               
        Pattern p  = Pattern.compile("^[A-Za-z]+(?:\\s[A-Za-z]+)*$");
        Matcher m = p.matcher(name);
        
        if(m.matches())
            System.out.println("Your name is Appllicable");
        else 
            throw new UserException("Your name is not Applicable!!!");
    }
}
