package Java.learn.multiTRE;

class HThread extends Thread{
    public HThread(String nameH){
        super(nameH);
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            System.out.println(count++ + "HThread");
        }
    }
}


public class TestThread3 {
    public static void main(String[] args) {
        HThread M3 = new HThread("Thread 3");
//        M3.setDaemon(true);
        M3.start();
        //as we can see that nothing was printed because main function got end so the all threads and program ends..
        //so if u want that the main should wait for the thread to complete so we will call join method...

        //we cannot directly make a thread join...first we have to make a reference we can do that by...
//        Thread mainThread = Thread.currentThread();
//        try {
//            mainThread.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        int count = 1;
        while (true){
            System.out.println(count++ + "Main");
            //this will pause main thread and make other threads to execute
            Thread.yield();
        }

    }
}
