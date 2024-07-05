package Java.learn.multiTRE;
/*Here producer write the data and consumer read the data*/

class MyData2{
    int value=0;
    boolean flag = true;

    synchronized public void set(int value){
        try{
            while(flag != true){
                wait();
            }
        }catch (Exception e){System.out.println(e);}

        this.value=value;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x = 0;
        try {
            while (flag != false) {
                wait(100);
            }
        }catch (Exception e){System.out.println(e);}

        x=this.value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MyData2 myDt;

    Producer (MyData2 data){myDt=data;}

    @Override
    public void run() {
        int i=1;
        while (true){
            myDt.set(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}

class Consumer extends Thread{
    MyData2 mydt;

    Consumer(MyData2 data){mydt=data;}

    @Override
    public void run() {
        while (true){
            System.out.println("Consumer: "+mydt.get());
        }
    }
}

public class InterThreadEx1 {
    public static void main(String[] args) {
        MyData2 mydt = new MyData2();
        Producer p = new Producer(mydt);
        Consumer c = new Consumer(mydt);

        p.start();
        c.start();
    }
}
