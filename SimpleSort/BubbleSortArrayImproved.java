public class BubbleSortArrayImproved {
    private long[] data;                 // reference to the array data
    private int numberOfElements;        // number of data items

    public BubbleSortArrayImproved(int max) { // constructor
        data = new long[max];             // create the array
        numberOfElements = 0;             // no items yet
    }

    public void insert(long value) { // insert element into array
        data[numberOfElements] = value; // insert it
        numberOfElements++;             // increment size
    }

    public void display() { // display array contents
        System.out.println("-------Array--------");
        for (int j = 0; j < numberOfElements; j++) // for each element,
            System.out.print(data[j] + " ");  // display it
        System.out.println("");
        System.out.println("--------------------");
    }

    public void bubbleSort() {
        int leftOut, rightOut, in;

        for (leftOut = 0, rightOut = numberOfElements - 1; leftOut < rightOut; leftOut++, rightOut--) {
            // Left to right pass (largest item moves to the right)
            for (in = leftOut; in < rightOut; in++) {
                if (data[in] > data[in + 1]) {
                    swap(in, in + 1);
                }
            }

            // Right to left pass (smallest item moves to the left)
            for (in = rightOut - 1; in > leftOut; in--) {
                if (data[in] < data[in - 1]) {
                    swap(in, in - 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }

    public static void main(String[] args) {
        int maxSize = 10;                    // array size
        BubbleSortArrayImproved arr;          // reference to array
        arr = new BubbleSortArrayImproved(maxSize);  // create the array
    
        arr.insert(10);               // insert 10 items
        arr.insert(9);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(1);
    
        arr.display();                // display items
    
        arr.bubbleSort();          // bubble sort them
    
        arr.display();                // display them again
    }
    
}
