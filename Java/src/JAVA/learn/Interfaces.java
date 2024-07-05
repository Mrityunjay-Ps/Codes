package JAVA.learn;
/*
* Here we have Java.learn about interfaces
* It is completly used to achive polymorphsim...If you dont want to borrow(inherit) then use interfaces
* When a super class has nothing to share all it can force sub class to override the abstract method method, so then
* we can write interface
*
* Interfaces are implimented
* we can make referance of interfaces but cannot make object of it as it is fully abstract...
* */
interface test{
    void meth1();
    void meth2();
}
class my implements test{
    public void meth1(){
        System.out.println("meth1 of class my");
    }
    public void meth2(){
        System.out.println("meth2 of class my");
    }
    public void meth3(){
        System.out.println("meth3 of class my");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        test t=new my();
        t.meth1();
        t.meth2();
    }
}
