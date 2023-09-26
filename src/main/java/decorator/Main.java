package decorator;

public class Main {

    public static void main(String[] args) {
        Noodles beefNoodles1 = new Egg(new BeefNoodles());
        beefNoodles1.make();
        Noodles beefNoodles2 = new Pepper(new BeefNoodles());
        beefNoodles2.make();
        System.out.println("******************");
        Noodles muttonNoodles1 = new Egg(new MuttonNoodles());
        muttonNoodles1.make();
        Noodles muttonNoodles2 = new Pepper(new MuttonNoodles());
        muttonNoodles2.make();
    }
}
