package Java.learn.multiTRE;
/*...Here we Java.learn about how to achive multithreading using Runnable Interface...*/
class My implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(i<50){
            System.out.println(i+" hello");
            i++;
        }
    }
}
class test49{
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(i<50){
            System.out.println(i+" world");
            i++;
        }
    }
}
