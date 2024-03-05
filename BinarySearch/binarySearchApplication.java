import java.util.Scanner;
public class binarySearchApplication {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Enter the value that do you need to search :");
            int key = cin.nextInt(); 
            binarySearch binarySearchObj = new binarySearch(array, array.length);
    
            int foundIndex = binarySearchObj.search(key);
            if (foundIndex != -1) {
                System.out.println("Key found at index: " + foundIndex);
            } else {
                System.out.println("Key not found.");
            }
        }    
}
