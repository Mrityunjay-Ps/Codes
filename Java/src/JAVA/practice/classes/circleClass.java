package Java.practice.classes;

class circleClass {
    public double radius;

    public double area() {
        double area;
        area = Math.PI*radius*radius;
        return area;
    }

    public double perimeter() {
        double perimeter;
        perimeter=2*Math.PI*radius;
        return perimeter;
    }

    public double circumference() {
        return  perimeter();
    }
}

class circle1 {
    public static void main(String[] args) {
        circleClass c1 = new circleClass();
        circleClass c2 = new circleClass();

        c1.radius = 7.6548;
        c2.radius = 14.564354;

        System.out.println("Circumference "+c1.circumference());
        System.out.println("Area "+c1.area());
        System.out.println("Perimeter "+c1.perimeter());
        System.out.println();
        System.out.println("Circumference2 "+c2.circumference());
        System.out.println("Area2 "+c2.area());
        System.out.println("Perimeter2 "+c2.perimeter());

    }
}