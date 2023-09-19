package factory.factory03;

public class BJCheesePizza extends AbstractPizza{
    @Override
    protected void bake() {
        System.out.println("BJCheesePizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("BJCheesePizza cut");
    }

    @Override
    protected void box() {
        System.out.println("BJCheesePizza box");
    }
}
