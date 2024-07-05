/*Here we will see how to implement monitor in java...*/
/*Suppose we have a shared object and it has only one method display*/
//There are 2 ways to synchronize: 1) Make a synchro block 2) make the method synchro....
package Java.learn.multiTRE;

//data class..
class MyData{
    //display method taking a string...
    //to make it synchronized...

    //2 way to do...making the method synchronized...
     synchronized void display(String str){

        //1 way to do...making a synchro block...
//        synchronized (this) {

            //printing letter by letter...
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
//        }
    }
}

//Thread1
class MyThread1 extends Thread{

    //reference of MyData...
    MyData dt;

    //Constructor...
    MyThread1(MyData d1){
        dt=d1;
    }

    //run method
    @Override
    public void run() {
        //calling display method...
        dt.display("Hello World");
    }
}

class MyThread2 extends Thread{
    //reference of MyData...
    MyData data;

    //Constructor...
    MyThread2(MyData dat){
        data=dat;
    }

    //run method
    @Override
    public void run() {
        //calling display method...
        data.display("Welcome");
    }
}

public class MonitorEx1 {
    public static void main(String[] args) {

        //create object of mydata...
        MyData dt1 = new MyData();

        //create object of thread1&2..
        MyThread1 t1 = new MyThread1(dt1);
        MyThread2 t2 = new MyThread2(dt1);

        //starting threads....
        t1.start();
        t2.start();
    }
}
