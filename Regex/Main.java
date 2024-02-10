package Regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name=insert.nextLine();

        JavaRegex newname =  new JavaRegex(name);
        try {
           newname.nameChecker();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
