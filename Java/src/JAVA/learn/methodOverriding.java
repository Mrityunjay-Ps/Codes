package Java.learn;
/*
* Here we Java.learn about method overriding
* (already the class has the method(dislpay5) but then also we have define display5 same method again in sub class)
* Re-defining superclass(circle5) method in subclass(cylinder) is called method overriding
* here we can se circle5 have a method dislpay5 and cylinder which already inherit circle5 is also having display5
* method..
*
* so when we make object of sub class(cylinder) then it have two methods with same name(display5) then the display5 of
* super class(circle5) is shadowed and if we call the dislpay5 method then the method which is declared in sub/child
* class id called....
*
* */
class circle5 {
    static void display5(){
        System.out.println("Hello");
    }
}
class cylinder extends circle5{
    static void display5(){
        System.out.println("Hello World");
    }
}

class Ma5in{
    public static void main(String[] args) {
        cylinder c2 = new cylinder();
        c2.display5();
    }
}