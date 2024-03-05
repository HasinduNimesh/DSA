public class InsertSortArray {
    private long[] data;                 // reference to the array data
    private int numberOfElements;        // number of data items

    public InsertSortArray(int maxSize) { // constructor
        data = new long[maxSize];             // create the array
        numberOfElements = 0;                  // no items yet
    }

    public void insert(long value) { // insert element into array
        data[numberOfElements] = value;      // insert it
        numberOfElements++;                  // increment size
    }

    public void display() { // display array contents
        System.out.println("-------Array--------");
        for (int j = 0; j < numberOfElements; j++) // for each element,
            System.out.print(data[j] + " ");  // display it
        System.out.println("");
        System.out.println("--------------------");
    }

    public void insertionSort() {
        int in, out;
        int copyCount = 0;
        int compareCount = 0;

        for (out = 1; out < numberOfElements; out++) { // out is dividing line
            long temp = data[out];          // remove marked item
            in = out;                     // start shifts at out
            compareCount++;
            while (in > 0 && data[in - 1] >= temp) { // until one is smaller,
                data[in] = data[in - 1];            // shift item to right
                in--;                         // go left one position
                copyCount++;
            }
            data[in] = temp;              // insert marked item
        }
        System.out.println("Total copies: " + copyCount);
        System.out.println("Total comparisons: " + compareCount);
    }

    public long median() {
        insertionSort();
        if (numberOfElements % 2 == 0) {
            // If the number of elements is even, average the middle two elements
            return (data[numberOfElements / 2 - 1] + data[numberOfElements / 2]) / 2;
        } else {
            // If the number of elements is odd, return the middle element
            return data[numberOfElements / 2];
        }
    }

    public static void main(String[] args) {
        int maxSize = 10;            // array size
        InsertSortArray arr;          // reference to array
        arr = new InsertSortArray(maxSize);  // create the array

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

        arr.insertionSort();          // insertion-sort them

        arr.display();                // display them again

        System.out.println("Median : " + arr.median());
    }
}
