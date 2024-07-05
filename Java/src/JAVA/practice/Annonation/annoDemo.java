package JAVA.practice.Annonation;

class Parent {
    public void display ( ) {}
}

class Child extends Parent {
    @Override
    public void display ( )
    {
        System.out.println("Hello");
    }
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

public class annoDemo {
//    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
    }
}
