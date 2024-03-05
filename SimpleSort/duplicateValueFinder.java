public class duplicateValueFinder {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8};
    
            System.out.println("Duplicate elements in given array: ");
            //Searches for duplicate elements
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j])
                        System.out.println(array[j]);
                }
            }
        }
    
}
