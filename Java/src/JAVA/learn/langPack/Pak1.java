package Java.learn.langPack;

public class Pak1 {
    public static void main(String[] args) {
//        Integer i = new Integer(10);//not supported..
        Integer i = Integer.valueOf(10); //we can make object of integer like this but for byte
        byte b = 10;
//        this is because any number is an integer type...
        Byte bb=Byte.valueOf(b);

        //if we have a primitive data type..
        int a = 20;
        //so we can wrap it around the wrapper class like this..
        Integer aa = a;
        //this is called auto boxing...and we can do reverse of this which is auto unboxing...
        int v = aa;

        int sa = 10;
        Integer aaa = sa;




    }
}
