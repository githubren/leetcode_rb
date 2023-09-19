package factory.factory03;

public class SHGreakPizza extends AbstractPizza{
    @Override
    protected void bake() {
        System.out.println("SHGreakPizza bake");
    }

    @Override
    protected void cut() {
        System.out.println("SHGreakPizza cut");
    }

    @Override
    protected void box() {
        System.out.println("SHGreakPizza box");
    }
}
