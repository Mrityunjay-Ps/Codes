package Java.learn.multiTRE;

/*Let see Thread Class / Group*/
class MyThread extends Thread
{
    public MyThread(String name){

        super(name);
        //we can set priority here also
        setPriority(Thread.MAX_PRIORITY);
    }
}


//class RunThread implements Runnable{
//    @Override
//    public void run() {
//
//    }
//}
public class TestThread {
    public static void main(String[] args) throws Exception {
//        Thread t = new Thread();// this is non pameterise constructor
        MyThread t = new MyThread("My Thread 1");
        //we can set thread priority anywhere...
        t.setPriority(9);
        System.out.println("ID: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        t.start();
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());
    }
}
