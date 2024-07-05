package JAVA.practice.classes;

class rectangle {

    private int length;
    private int breath;

    public rectangle() {

    }

    public rectangle(int l, int b) {
        length = l;
        breath = b;
    }

    public int area() {
        return length * breath;
    }
}
////////
class output {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        System.out.println(r1.area());
    }
}