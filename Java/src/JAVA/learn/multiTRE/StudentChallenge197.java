package Java.learn.multiTRE;

class Whiteboard{
    String value;
    int numberOfStudent = 0;
    int count = 0;

    public void attendence(){
        numberOfStudent++;
    }

    synchronized public void write(String text){
        System.out.println("Teacher is writing: "+text);
        while(count!=0){
            try{wait();}catch (Exception e){System.out.println(e);}
        }
        this.value=text;
        count=numberOfStudent;
        notifyAll();
    }

    synchronized public String read(){
        while (count==0){
            try{wait();}catch (Exception e){System.out.println(e);}
        }

        String t = value;
        count--;
        if (count == 0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread{
    Whiteboard wb;
    String [] notes = {"Java is a language","Its OOPs","It is platform independent","Its support thread","End"};

    public Teacher(Whiteboard w){
        wb=w;
    }

    @Override
    public void run() {
        for (int i=0; i<notes.length;i++){
            wb.write(notes[i]);
        }
    }
}

class Students extends Thread{
    String name;
    Whiteboard wb;

    public Students(String n, Whiteboard w){
        name=n;
        wb=w;
    }

    @Override
    public void run() {
        String text;
        wb.attendence();

        do {
            text=wb.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while (!text.equals("end"));
    }
}

class Thread236{
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Students s1 = new Students("1. Jay",wb);
        Students s2 = new Students("2. Harry",wb);
        Students s3 = new Students("3. James",wb);
        Students s4 = new Students("4. Nick",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}