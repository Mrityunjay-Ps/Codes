package Java.practice.InnerClass;

class text{
    static int x = 10;
           int y = 20;

    static class Inner{
        void display(){
            System.out.println(x);
            //System.out.println(y);//cannot access y because y is not static
        }
    }
}

class main8{
    public static void main(String[] args) {
        text.Inner i = new text.Inner();
        i.display();
    }
}