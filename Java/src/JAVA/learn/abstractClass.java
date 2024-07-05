package JAVA.learn;
/*
* Here we Java.learn about abstract class
* If a class is having atleast one abstract method then it is a abstract class, without any abstract method we can
* define a class abstract...
*
* If a class is inheriting from abstract class then the new class is also a abstract class but if the abstract method
* is override then it is not a abstract class it is a concrete class...
*
* abstract method which has no body...
* concete class are those which dont have a abstract method...
*
* we cannot create object of the abstract class but we can declare(make a referance) it...
*
* abstract class are ment only for inheitance
* */
abstract class Super3 {
    public Super3(){
        System.out.println("Super Constructor");
    }
    public void meth1()
    {
        System.out.println("Meth of Super");
    }
    abstract public void meth2();
}

class subb extends Super3{
    @Override
    public void meth2(){
        System.out.println("Sub Meth 2");
    }
}

class AbstractClass{
    public static void main(String[] args) {
        Super3 su = new subb();
        su.meth1();
        su.meth2();
    }
}