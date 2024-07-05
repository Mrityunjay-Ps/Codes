package JAVA.yt.kunalK.Java.Opps;

public class Shapes {
    int length;
    int width;

    public Shapes(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

//Inheritance
class Rectangle extends Shapes{
    int breadth;


    public Rectangle(int length, int width, int breadth) {
        super(length, width);
        this.breadth = breadth;
    }
}