class stackArr{
    int max;
    int[] stack;
    int top = -1;

    public stackArr(int max){
         this.max = max;
         stack = new int[max];
    }

    public void push(int pushNum){
        try {
            if(isFull()) {
                System.out.println("This stack is Full !!!");
            } else {
                top++;
                stack[top]=pushNum;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("This array is already Empty !!!");
        } else {
            --top;
        }
    }

    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }

    public boolean isFull(){
        if(max-1 == top) return true;
        else return false;
    }

    public int peek(){
        return stack[top];
    }

    public void arrPrint(){
        if(isEmpty()){
            System.out.println("This array is already Empty !!!");
        }else{
            System.out.println("-------Array------");
            for(int i=0;i<=top;i++){
                System.out.println(stack[i]);
            }
            System.out.println("------------------");
        }
    }
}