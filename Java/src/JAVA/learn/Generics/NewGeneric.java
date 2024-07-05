package Java.learn.Generics;
/*
* This Data Class is compatible to store any type of object but only one object at a time
* */
class Data<T> {
    private T obk;

    public void setObk(T obk) {
        this.obk = obk;
    }

    public T getObk() {
        return obk;
    }
}

@SuppressWarnings("unchecked")
class MyArray<T> {
    //here we have created a generic type array....
    T []arr =(T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        arr[length++] = v;
    }

    public void dispaly() {
        /*
        for(T x:A) {
            System.out.println(x);
        }
        But there is a problem in this for each loop, assume if we have not fully filed the array then it may
        cause error so to overcome that we write for loop
        */

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class NewGeneric{

    /*
    * We can also write an generic method in an non genric class
    *
    * ex:-
    *   public class Generic{
    *       static <T> void show(<T> list) {
    *
    *       }
    *   }
    */

//    static <T> void show(T[] list) {
//        for (T x:list) {
//            System.out.println(x);
//        }
//    }


    static void fun(MyArray obj){
        obj.dispaly();
    }



    public static void main(String[] args) {

        Data n1 = new Data();

        n1.setObk(10);
        /*
        * OR
        * n1.seyObk(new Integer(10));
        * */
        System.out.println(n1.getObk());

//        MyArray <String> ma = new MyArray<>();

        MyArray <Integer>ma = new MyArray<>();
//        ma.append("Hello");
        ma.append(22);
        ma.append(1);
        ma.append(29);

        ma.dispaly();

        /*
        * Here we will get an error that unsafe or unchecked error
        * as we are typecasting object class to generic
        * we can supress warning by using annotation @supresswaring
        * */

        /*Generic Method*/
//        show(new Integer[]{10,20,30});
//        show(new String[]{"Hi","Hello","Bye"});

        /*wildcard*/
        MyArray<String> mas1 = new MyArray<>();
        mas1.append("Hi");
        mas1.append("Hello");
        MyArray<Number> man2 = new MyArray<>();
        man2.append(45);
        man2.append(126);

        fun(mas1);
        fun(man2);

    }

}
