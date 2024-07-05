package Java.learn.langPack;

public class Expack {
    public static void main(String[] args) {
        //String-String Builder-String Buffer....

        String sa = new String("Hey");

        StringBuffer sb = new StringBuffer("Hello");

        StringBuilder sbb = new StringBuilder("Ciao");

        sa.concat("Jay");
        sb.append("World");
        sbb.append("World");

        System.out.println(sa);
        System.out.println(sb);
        System.out.println(sbb);
    }
}
