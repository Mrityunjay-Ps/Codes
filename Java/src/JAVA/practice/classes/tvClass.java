package Java.practice.classes;

class tvClass {
    public short tvSize;
    public String tvPanel;
    public String brand;

    public int increaseVolume(byte volume) {
        return volume;
    }

    public int changeChannel(short channel) {
        return channel;
    }

    public int changeBrightness(byte brigthness) {
        return brigthness;
    }
}

class tvTest{
    public static void main(String[] args) {
        tvClass tv1 = new tvClass();
        tv1.tvSize = 85;
        tv1.tvPanel = "Qled";
        tv1.brand = "Sony";

        System.out.println(tv1.increaseVolume((byte) 25));
        System.out.println(tv1.changeChannel((short) 156));
        System.out.println(tv1.changeBrightness((byte) 85));
    }
}
