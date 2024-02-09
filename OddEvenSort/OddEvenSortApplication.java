package OddEvenSort;
public class OddEvenSortApplication{
    public static void main(String[] args) {
        oddEvenSort b1 = new oddEvenSort(10);
        b1.insert(10);
        b1.insert(-5);
        b1.insert(0);
        b1.insert(90);
        b1.insert(1);
        b1.insert(-3);
        b1.insert(77);
        b1.insert(80);
        b1.insert(200);
        System.out.println("Entered Array ");
        b1.display();
        b1.oddEvenAlgo();
        System.out.println("Odd Even Sorted Array");
        b1.display();
    }
}