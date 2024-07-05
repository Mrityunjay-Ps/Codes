package Java.learn.multiTRE;
/*Here we will see Constructor, Sleep and Interrupt...*/
class MThread extends Thread{
    public MThread(String name){
        super(name);
    }

    //for example here is a infinite loop and if u want that the loop should sleep for a while and then
    //run again and repeat this all....

    @Override
    public void run() {
        int count = 1;
        while (true){
            System.out.println(count++);
            //as this makes an exception so we have to write it in try and catch block....
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}




public class TestThread2 {
    public static void main(String[] args) {
        MThread M2 = new MThread("Thread 2");

        M2.start();
        M2.interrupt();
    }
}
