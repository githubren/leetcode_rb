package decorator;

public class BeefNoodles extends Noodles{

    @Override
    protected void make() {
        System.out.println("煮碗牛肉面");
    }
}
