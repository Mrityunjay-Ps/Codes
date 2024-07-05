package Java.practice.classes;

class subjects {
    private String subID;
    private String SunName;
    private int maxMarks;
    private int MarksObtain;

    public subjects(String sID, String Sname, int maxM)
    {
        subID=sID;
        SunName=Sname;
        maxMarks=maxM;
    }

    //property methods...
//get method...
    public String getSubID() {
        return subID;
    }

    public String getSunName() {
        return SunName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return MarksObtain;
    }

//set method
    public void setMaxMarks(int maMarks) {
        maxMarks = maMarks;
    }

    public void setMarksObtain(int mObtain) {
        MarksObtain = mObtain;
    }

    boolean isQualified() {
        return MarksObtain>=maxMarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+SunName+"\n MarksObtained "+MarksObtain;
    }


}

class outputS{
    public static void main(String[] args) {
        subjects subs[]=new subjects[3];
        subs[0]=new subjects("s101","DS",100);
        subs[1]=new subjects("s102","Algorithms",100);
        subs[2]=new subjects("s103","Operating Systems",100);

        for (subjects s:subs) {
            System.out.println(s);
        }

    }
}