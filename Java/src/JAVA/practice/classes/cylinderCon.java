package Java.practice.classes;

class cylinderCon {

    //properties of cylinder...
    private double radius;
    private double height;

    //methods...
    public double baseArea() {
        double PI = Math.PI;
        return PI*radius*radius;
    }

    public double volumeCylinder() {
        double PI = Math.PI;
        return PI*radius*radius*height;
    }

    //constructor...
    public cylinderCon() {
        radius = 1;
        height = 5;
    }
    public cylinderCon(double rad) {
        setRad(rad);
    }
    public cylinderCon(double r, double h) {
        setRad(r);
        setHei(h);
    }

    //get method...
    public double getRad() {
        return radius;
    }
    public double getHei() {
        return height;
    }

    //set method...
    public void setRad(double r) {
        if (r>=0){
            radius = r;
        }else {
            radius = 0;
        }
    }
    public void setHei(double h) {
        if (h>=0){
            height = h;
        }else {
            height = 0;
        }
    }
}

class outputCylin{
    public static void main(String[] args) {
        cylinderCon cyl1 = new cylinderCon(5.6,8.32);
        System.out.println(cyl1.volumeCylinder());

    }
}
