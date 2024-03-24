import java.util.Scanner;

public class stackApplication {
    public static int operationButton;
    public static void main(String[] args) {
        stackArr stack1 = new stackArr(100);

        do{
        System.out.println("====================================");
        System.out.println("\tStack Operations Menu");
        System.out.println("====================================");
        System.out.println("1. Add items");
        System.out.println("2. Delete items");
        System.out.println("3. Display the value at top");
        System.out.println("4. Print all items");
        System.out.println("5. Exit");
        System.out.println("====================================");

        System.out.print("Enter your option :");

        Scanner cin = new Scanner(System.in);
        operationButton=cin.nextInt();

        switch (operationButton) {
            case 1:
                System.out.print("Insert item to add : ");
                stack1.push(cin.nextInt());
                break;
            case 2:
            stack1.pop();
                System.out.println("Top value deleted sucessfully !!!");
                break;
            case 3:
                System.out.println("Top most value in stack is "+stack1.peek());
                break;
            case 4:
                stack1.arrPrint();
                break;
            case 5:
                System.out.println("Program Closing!!!");
                break;
            default:
                System.out.println("Please enter correct option !!!");
                break;
        }
        }while(operationButton!=5);

    }
}
