package JAVA.practice.classes;

class studentClass {

    public short rollno;
    public String name;
    public String coursename;
    public float m1,m2,m3;

    public float total() {
        return m1+m2+m3;
    }

    public float average() {
        return (m1+m2+m3)/3;
    }

    public void grade() {
        if (average()>90f) {
            System.out.println("A+");
        }else if (average()>=85 && average()<=90) {
            System.out.println('A');
        }else if (average()>=75 && average()<85) {
            System.out.println('B');
        }else if (average()>=60 && average()<75) {
            System.out.println('C');
        }else if (average()>=50 && average()<60) {
            System.out.println('D');
        }else {
            System.out.println('E');
        }
    }
}

class student{
    public static void main(String[] args) {
        studentClass s1 = new studentClass();
        s1.rollno = 45;
        s1.name = "Mrityunjay Singh";
        s1.coursename = "Computer Science and Technology";
        s1.m1 = 75; s1.m2 = 86; s1.m3 = 90;

        System.out.println("Total of m1, m2 and m3 : "+s1.total());
        System.out.println("Average is : "+s1.average());
        s1.grade();


    }
}