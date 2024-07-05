package Java.learn.Generics;
/*
* With Object Class, we can achive genrelization
* we can assign object class with any subclass
* ex:- Object obj = new String("Hello");
*             obj = new Integer(10);
*
* */
public class Basic {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        obj = new Integer(10);
//        Incorrect way...
//        String str = obj;

//        Correct way...
        String str = (String) obj;

        /*
        * As we can see here, I have first assigned a string to an Object class then reassign the object class
        * to an integer(Till here we did not get any error) But we will get a runtime exception called
        * ClassCastException (it says that an Integer cannot be cast in String...)
        *
        * We cannot assign a obj reference directly to any other type we have to TypeCast it
        * String str = (String) obj;
        * */

    }
}
