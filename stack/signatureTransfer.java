public class signatureTransfer {
    //fuction of value transfer
    public static void transfer(stackArr S,stackArr T){
        for(int i = S.top,j = 0; i>=0;i--,j++){
            T.stack[j]=S.stack[i];
        }
        //make S top value similer to the T top value
        T.top=S.top;
    }
    public static void main(String[] args) {
        stackArr S = new stackArr(10);
        stackArr T = new stackArr(10);

        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);
        S.arrPrint();
        //transfer values from S to T
        transfer(S,T);
        
        T.arrPrint();
    }
}
