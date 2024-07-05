package Java.practice;

class StackOverflow extends Exception{
    public String toSting(){
        return "Stack is Full...";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty...";
    }
}

class stack{
    private int size;
    private int top = -1;
    private int Stack[];

    public stack(int size){
        this.size=size;
        Stack = new int[size];
    }

    public void Push(int elemnet) throws StackOverflow
    {
        if (top==size-1)
            throw new StackOverflow();
        top++;
        Stack[top]=elemnet;
    }

    public int Pop() throws StackUnderflow
    {
        int x=-1;
        if (top == -1)
            throw new StackUnderflow();
        x=Stack[top];
        top--;
        return x;
    }
}

class test56 {
    public static void main(String[] args) {
        stack s = new stack(5);
        try{
            s.Push(10);
            s.Push(14);
            s.Push(19);
            s.Push(22);
            s.Push(29);
        }catch (StackOverflow e)
        {
            System.out.println(e);
        }

    }
}
