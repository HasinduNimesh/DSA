package OddEvenSort;
public class oddEvenSort {
    private long[] oddEvenArray; // ref to array a
    private int nElems; // number of data items

    public oddEvenSort(int max) { // constructor
        oddEvenArray = new long[max]; // create the array
        nElems = 0; 
    }
//insert values to the array
    public void insert(long value) {
        if(!(nElems>=oddEvenArray.length)){
        oddEvenArray[nElems] = value;
        System.out.println(value+" inserted Succesfully");
        nElems++; // increment element count
        }else{
            System.out.println("Array is full !!! ");
        }
    }
//display the array
    public void display() {
        System.out.println("-----Array-----");
        for (int i = 0; i < nElems; i++) { 
            System.out.print(oddEvenArray[i]+" ");
        }
        System.out.println("\n---------------");
    }
//swap the word given
    private void swap(int first_word, int second_word) {
        long temp = oddEvenArray[first_word]; // Use a temporary variable to store one of the values during swapping
        oddEvenArray[first_word] = oddEvenArray[second_word];
        oddEvenArray[second_word] = temp;
    }

    public void oddEvenAlgo(){
        boolean flag=false;
        while(!flag){
            flag=true;
            for(int i = 0;i<nElems-1;i=i+2){
                if(oddEvenArray[i]>oddEvenArray[i+1]){
                swap(i, i+1);
                flag=false;
                }
                display();
            }
            for(int i = 1;i<nElems-2;i=i+2){
                if(oddEvenArray[i]>oddEvenArray[i+1]){
                    swap(i, i+1);
                    flag=false;
                }
                display();
            }
        }
    }
}
