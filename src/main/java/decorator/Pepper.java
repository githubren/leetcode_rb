package decorator;

public class Pepper extends NoodlesDecorator{

    public Pepper(Noodles noodles) {
        super(noodles);
    }

    @Override
    protected void make() {
        super.make();
        add();
    }

    @Override
    protected void add() {
        System.out.println("加辣椒");
    }
}
