package JAVA.practice.InnerClass;

class test4{
    void dispaly(){
        class Inner2{
            void innerDisplay2(){
                System.out.println("Hello Inner");
            }
        }
        Inner2 i = new Inner2();
        i.innerDisplay2();
    }
}

class masin8{
    public static void main(String[] args) {
        test4 y = new test4();
        y.dispaly();
    }
}