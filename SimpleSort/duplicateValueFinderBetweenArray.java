public class duplicateValueFinderBetweenArray {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {4, 5, 6, 1, 8};
    
            System.out.println("Common elements between two arrays are: ");
            for (int i : array1) {
                for (int j : array2) {
                    if (i == j) {
                        System.out.println(i);
                        break; // Break inner loop to avoid duplicate output
                    }
                }
            }
        }
}
