package Java.practice.classes;

class rectangleClass {
     public int length;
     public int breath;

     public int area() {
         return length*breath;
     }

     public int perimeter(){
          return 2*(length+breath);
     }

     public boolean isSquare() {
          if (length==breath)
               return true;
          return false;
     }

}

class rectangleOutput {
     public static void main(String[] args) {
          rectangleClass r1 = new rectangleClass();
          r1.length=20;
          r1.breath=10;

          System.out.println("Area "+r1.area());
          System.out.println("Perimeter "+r1.perimeter());
          boolean square = r1.isSquare();
          if (square) {
               System.out.println("It is a square(length and breath are same).");
          }else {
               System.out.println("It Rectangle.");
          }
     }
}