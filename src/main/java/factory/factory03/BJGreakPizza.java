package factory.factory03;

public class BJGreakPizza extends AbstractPizza{
    @Override
    protected void bake() {
        System.out.println("BJGreakPizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("BJGreakPizza cut");
    }

    @Override
    protected void box() {
        System.out.println("BJGreakPizza box");
    }
}
