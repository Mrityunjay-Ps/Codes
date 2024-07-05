package Java.practice.Inheritance;

class paramConInheritCircle {
    float radius;
    public paramConInheritCircle(){
        radius =1.0f;
    }
    public paramConInheritCircle(float rad){
        radius=rad;
    }
}

class pramcylinder extends paramConInheritCircle{
    float height;
    public pramcylinder(){
        height=1;
    }
    public pramcylinder(float height){
        this.height=height;
    }
    public pramcylinder(float radius, float height){
        super(radius);
        this.height=height;
    }
    float volume(){
        return (float) ((Math.PI*(radius*radius))*height);
    }
}

class test3{
    public static void main(String[] args) {
        pramcylinder pcyl1 = new pramcylinder(2.6f,10);
        System.out.println(pcyl1.volume());
    }
}