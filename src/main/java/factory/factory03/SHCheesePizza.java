package factory.factory03;

public class SHCheesePizza extends AbstractPizza{
    @Override
    protected void bake() {
        System.out.println("SHCheesePizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("SHCheesePizza cut");
    }

    @Override
    protected void box() {
        System.out.println("SHCheesePizza box");
    }
}
