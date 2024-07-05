package Java.practice.classes;

class cylinderClass {
    public double radius;
    public double height;

    public double lidArea(){
        return (Math.PI*radius*radius);
    }

    public double totalSurfaceArea(){
        return 2*lidArea()+circum()*height;
    }

    public double circum(){
        return 2*Math.PI*radius;
    }

    public double volumeCir(){
        return (lidArea()*height);
    }

}

class cylinder {
    public static void main(String[] args) {
        cylinderClass cyclinder = new cylinderClass();
        cyclinder.radius=6;
        cyclinder.height=15;

        System.out.println("Lid Area of Cylinder is "+ cyclinder.lidArea());
        System.out.println("Total surface area of cylinder is "+cyclinder.totalSurfaceArea());
        System.out.println("Total cylinder volumer is "+cyclinder.volumeCir());
    }
}
