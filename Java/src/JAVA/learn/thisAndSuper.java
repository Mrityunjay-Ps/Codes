package JAVA.learn;

class rectangle2 {
    int lenght;
    int breath;
    int x = 10;

    public rectangle2(int lenght, int breath){
        this.lenght=lenght;
        this.breath=breath;
    }
}

class cube5 extends rectangle2{
    int height;
    int x = 20;

    public cube5(int len, int bret, int height){
        super(len,bret);
        this.height=height;
    }

    boolean display(){
        System.out.println(super.x);
        System.out.println(x);
        return false;
    }
}

class MainTest {
    public static void main(String[] args) {
        cube5 cu = new cube5(12,56,6);
        System.out.println(cu.display());

    }
}
