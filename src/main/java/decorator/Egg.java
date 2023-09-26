package decorator;

public class Egg extends NoodlesDecorator{

    public Egg(Noodles noodles) {
        super(noodles);
    }

    @Override
    protected void make() {
        super.make();
        add();
    }

    @Override
    protected void add() {
        System.out.println("加煎蛋");
    }
}
