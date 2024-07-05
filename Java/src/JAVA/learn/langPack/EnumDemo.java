package Java.learn.langPack;

enum Dept{
    //here every one is final and static...
    CSE, IT, EC, ETC, CIVIL;
    private Dept(){
        System.out.println(this.name());
    }

    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept dt = Dept.CSE;
        //gives index...
//        System.out.println(dt.ordinal());
        dt.display();
    }
}
