import java.util.Scanner;
class linearSearch{
    public int[] array;
    public int nElems;
    public linearSearch(int[] array,int nElems){
        this.array=array;
        this.nElems=nElems;
    }
    public int lSearch(int value){
        int eCount=0;
        for(int i=0;i<nElems;i++){
            if(value==array[i]){
                eCount++;
            }
        }
        return eCount;
    }
    public static void main(String[] args) {
        int[] array={10,20,30,50,40,50,90,80};
        linearSearch a1 = new linearSearch(array, array.length-1);
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter value that want to find !!!");
        int returnNumOfFinders = a1.lSearch(cin.nextInt());
        if(returnNumOfFinders==0) System.out.println("Unable to find the value you entered in the array !!!");
        else System.out.println("We found the value you inserted, "+returnNumOfFinders+" times.");
    }
}