import java.util.Scanner;
public class wordReverse {

    public static int charCount;//character cout of word
    public String word;
    
    public stackCharArray stringToStack(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your Word to reverse :");
        try{
            word = cin.nextLine();
            charCount = word.length();
        }catch(Exception e){
            System.out.println(e);
        }
        stackCharArray wordStack = new stackCharArray(charCount);
        for(int i = 0; i < charCount; i++){
            wordStack.push(word.charAt(i));
        }
        return wordStack;
    }

    public void stringReverse(stackCharArray wordStack){
        char[] reverseStack = new char[charCount];
        for(int i=charCount-1,j=0;i>=0;i--,j++){
            reverseStack[j]=(char)wordStack.stack[i];
        }
        System.out.print("Reverse of the word is : ");
        for(int i = 0;i<charCount;i++){
            System.out.print(reverseStack[i]);
        }
    }
    
    public static void main(String[] args) {
        wordReverse word1 = new wordReverse();
        stackCharArray wordStack = word1.stringToStack();
        word1.stringReverse(wordStack);

    }
}
