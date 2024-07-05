package Java.practice.Interfaces;

class Phone{
    void call(){
        System.out.println("Calling");
    }
    void sms(){
        System.out.println("SMS") ;
    }
}

interface Icamera{
    public void click();
    public void recordVideo();
}
interface ImusicPlayer{
    public void play();
    public void pause();
    public void stop();
}

class Smartphone extends Phone implements Icamera,ImusicPlayer{

    void videocall(){
        System.out.println("Video Call");
    }
    @Override
    public void click(){
        System.out.println("Click");
    }
    @Override
    public void recordVideo(){
        System.out.println("Record Video");
    }
    @Override
    public void play(){
        System.out.println("Play");
    }
    @Override
    public void pause(){
        System.out.println("Pause");
    }
    @Override
    public void stop(){
        System.out.println("Stop");
    }
}

class example2{
    public static void main(String[] args) {
        Smartphone smt = new Smartphone();
        Phone p = smt;
        Icamera c = smt;
        ImusicPlayer m = smt;

    }
}