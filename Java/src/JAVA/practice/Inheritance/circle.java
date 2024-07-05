package JAVA.practice.Inheritance;

class circle {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class cylinder extends circle {
    public double height;

    public double volume(){
        return area()*height;
    }
}

class test{
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 4.56d;
        c.height = 12.56d;
        System.out.println("Volume of a cylinder is: " + c.volume());
        System.out.print("Perimeter of a circle: "+c.perimeter()+"\nCircumference of a circle is: "+ c.perimeter());
    }
}
