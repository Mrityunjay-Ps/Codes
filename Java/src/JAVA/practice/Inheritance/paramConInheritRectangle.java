package Java.practice.Inheritance;

class rectanglePraCons {
    int length;
    int breath;
    
    public rectanglePraCons(){
        length=breath=1;
    }
    public rectanglePraCons(int l, int b){
        length=l;
        breath=b;
    }
}

class cube extends rectanglePraCons{
    int height;
    public cube(){
        height=1;
    }
    public cube(int hei){
        height=hei;
    }
    public cube(int l, int b, int h){
        super(l,b);
        height=h;
    }
    int vol(){
        return length*breath*height;
    }
}

class tedst{
    public static void main(String[] args) {
        cube c1 = new cube(5,5,5);
        System.out.println(c1.vol());
    }
}