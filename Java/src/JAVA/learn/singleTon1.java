package Java.learn;

class coffeeMachine{
    private float coffeeQTY;
    private float waterQTY;
    private float milkQTY;
    private float sugerQTY;

    static private coffeeMachine m = null;

    private coffeeMachine(){
        coffeeQTY = 1;
        waterQTY = 1;
        milkQTY = 1;
        sugerQTY = 1;
    }
    public void fillWater(float water){
        waterQTY=water;
    }
    public void fillSuger(float Suger){
        sugerQTY=Suger;
    }
    public float getCoffee(){
        return 0.15f;
    }

    static coffeeMachine getInstance(){
        if(m==null)
            m = new coffeeMachine();
        return m;

    }
}

public class singleTon1{
    public static void main(String[] args) {
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();
        coffeeMachine m3 = coffeeMachine.getInstance();

        System.out.println(m1+" "+m2+" "+m3);
        if (m1==m2&&m1==m3){
            System.out.println("Same");
        }

    }
}
