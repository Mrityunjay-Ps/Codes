package JAVA.learn;

class Test5{
    static int x  = 10;
    int y = 5;

    void show(){
        System.out.println(x+" "+y);
    }

    static void display(){
        System.out.println(x);
    }
}

class show1{
    public static void main(String[] args) {
//        Test5 t5 = new Test5();
//        t5.show();
//        Test5.x=20;

        Test5.display();



    }
}