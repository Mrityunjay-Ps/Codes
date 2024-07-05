package Java.practice.Inheritance;

class rectangle {
    public float length;
    public float breath;

    public float area() {
        return length*breath;
    }
    public float perimeter() {
        return 2*length*breath;
    }
    public boolean isSquare() {
        if (length==breath){
            return true;
        }else {
            return false;
        }
    }
}

class cuboid extends rectangle{
    public float height;

    public float surfaceArea() {
        return 6*(height*height);
    }
    public float volume() {
        return height*height*height;
    }
}

class test02{
    public static void main(String[] args) {
        cuboid c2 = new cuboid();
        c2.length = 4.6f;
        c2.breath = 6.7f;
        c2.height = 9.5f;

        System.out.println("Area of a rectangle is "+c2.area());
        System.out.println("Volume of a rectangle is "+c2.volume());
    }
}
