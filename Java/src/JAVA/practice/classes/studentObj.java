/* *
*
*
Here we have made a class studentObj in which there are properties, constructor, get-set methods, as we have made another
class for printing this... first we have made Array of objects of class SubjectObj of size 3, then one by one intizalize
the data in each index, after that for printing we used for-each loop....
*
*
* */


package Java.practice.classes;

import java.util.Arrays;

class studentObj {
    private int rollNo;
    private String Name;
    private String dept;
    private String[] subjects;

    //property method...
    //get methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return Name;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubjects() {
        return subjects;
    }

    //set methods
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    //constructor...
    public studentObj(short rollNo, String Name, String Dept){
        this.rollNo = rollNo;
        this.Name = Name;
        setDept(Dept);
    }
    public studentObj(short rollNo, String Name, String Dept, String[] subjects) {
        this.rollNo = rollNo;
        this.Name = Name;
        setDept(Dept);
        setSubjects(subjects);
    }

    public String toString()
    {
        return"\n Rollno: "+rollNo+"\n Name: "+Name+"\n Department: "+dept+"\n Subjects: "+ Arrays.toString(subjects);
    }
}

class outS{
    public static void main(String[] args) {
        studentObj[] sO1 = new studentObj[3];//Array of objects...
        sO1[0] = new studentObj((short) 25,"Jay", "CSE", new String[]{"Java","C++","OS"});
        sO1[1] = new studentObj((short) 28,"Arun","AI", new String[]{"Ai","TOC","Maths"});
        sO1[2] = new studentObj((short) 30,"Ajay","ETC",new String[]{"Robots", "Circuits", "Computer Networks"});

        for (studentObj s : sO1) {
            System.out.println(s);
        }
    }
}
