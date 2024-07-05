package Java.learn.multiTRE;
/*...Here we Java.learn about how to achive multithreading using Thread class...*/
class Test extends Thread{
    @Override
    public void run() {
        int i = 1;
        while(i<50){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        int i = 1;
        while(i<50){
            System.out.println(i+" world");
            i++;
        }
    }
}