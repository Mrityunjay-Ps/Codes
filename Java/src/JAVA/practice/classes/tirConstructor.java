package Java.practice.classes;

class tirConstructor{

    //properties....
    private double height;
    private double base;
    private double side2;
    private double side3;

    //method....
    public double area() {
        double a = 0.5;
        return a*(base*height);
    }
    public double peri() {
        return base + side2 + side3;
    }

    //constructor....
    public tirConstructor(int a, int b) {
        setBase(a);
        setHeight(b);
    }

    public tirConstructor(int z, int x, int c) {
        setZ(z);
        setX(x);
        setC(c);
    }
    //get method....
    public double getbase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public double getSide2() {
        return getSide2();
    }
    public double getSide3() {
        return getSide3();
    }
    //set method....
    public void setBase(double b) {
        if (b>=0){
            base = b;
        }else {
            base = 0;
        }
    }
    public void setHeight(double h) {
        if (h>=0){
            height = h;
        }else {
            height = 0;
        }
    }
    public void setZ(double zi) {
        if (zi>=0){
            base = zi;
        }else {
            base = 0;
        }
    }
    public void setX(double xi) {
        if (xi>=0){
            side2 = xi;
        }else{
            side2 = 0;
        }
    }
    public void setC(double ci) {
        if (ci>=0){
            side3 = ci;
        }else {
            side3 = 0;
        }
    }
}

class triOut{
    public static void main(String[] args) {
        tirConstructor tri1 = new tirConstructor(10,7,7);
        System.out.println(tri1.peri());
    }
}