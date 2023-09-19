package factory.factory02;

public class CheesePizza extends Pizza {
    @Override
    protected void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    protected void box() {
        System.out.println("CheesePizza box");
    }
}
