package factory.factory01;

public class GreakPizza extends Pizza{
    @Override
    protected void bake() {
        System.out.println("GreakPizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("GreakPizza cut");
    }

    @Override
    protected void box() {
        System.out.println("GreakPizza box");
    }
}
