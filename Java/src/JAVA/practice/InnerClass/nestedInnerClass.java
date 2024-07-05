package JAVA.practice.InnerClass;

class Outer{
    int C = 10;
    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println(C);
            System.out.println(y);
        }
    }
    void Outerdisplay(){
        Inner i = new Inner();
        i.innerDisplay();
//        System.out.println(i.y);
    }
}

class te5t6{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Outerdisplay();
//        Outer.Inner i = new Outer().new Inner();//to access only inner class
    }
}