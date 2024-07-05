package JAVA.practice.classes;

class triangleClass {
    private int base;
    private int height;

//  Geter Methods...
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }

//  Seter Methods...
    public void setBase(int b) {
//        base = b;
        if(base>0){
            base=b;
        }else {
            base=0;
        }
    }
    public void setHeight(int h) {
//        height = h;
        if (height>0) {
            height=h;
        }else {
            height=0;
        }
    }

//  Methods....
    public int triArea() {
        return (base*height)/2;
    }
    public int triperi(int a, int b, int c) {
        return a+b+c;
    }
}

class triOutput {
    public static void main(String[] args) {
        triangleClass tri1 = new triangleClass();

        tri1.setHeight(-15);
        tri1.setBase(-30);
        System.out.println(tri1.triArea());
        System.out.println(tri1.triperi(5,8,10));
    }
}