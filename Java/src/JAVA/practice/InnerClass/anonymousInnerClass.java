package Java.practice.InnerClass;

abstract class Myy{
    abstract void display1();
}
//same for interface as it also has abstract class...
class outer{
    public void meth1(){
        Myy m =new Myy(){
            public void display1()
            {
                System.out.println("Hello");
            }
        };
        m.display1();
    }
}