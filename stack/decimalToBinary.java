import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        stackArr stack = new stackArr(32); // Assuming a 32-bit binary number

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }
        
        System.out.print("Binary equivalent: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.peek());
            stack.pop();
        }

        scanner.close();
    }
}