package Java.practice.abstractclasses;

abstract class Shape {
    abstract float perimeter();
//    abstract void volume();
    abstract float area();
}

class circle6 extends Shape{
    float radius = 4.6f;
    float perimeter(){
        return (float) (2 * Math.PI * radius);
    }
    float area(){
        return (float) Math.PI*radius*radius;
    }
}

class  rectangle6 extends Shape{
    float length=8.4f;
    float breath=6.8f;
    float perimeter(){
        return 2 * (length + breath);
    }
    float area(){
        return length*breath;
    }
}

class TestShape{
    public static void main(String[] args) {
        Shape cir = new circle6();
        System.out.println("area of circle: "+cir.area());
        System.out.println("perimeter pf circle: "+cir.perimeter());

        Shape rec = new rectangle6();
        System.out.println("area of rectangle: "+rec.area());
        System.out.println("perimeter of rectangle: "+rec.perimeter());

    }
}