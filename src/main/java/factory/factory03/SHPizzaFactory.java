package factory.factory03;

public class SHPizzaFactory extends AbstractPizzaFactory{

    public SHPizzaFactory() {
        System.out.println("*******SHPizzaFactory*******");
    }
    @Override
    protected AbstractPizza createCheesePizza() {
        SHCheesePizza cheesePizza = new SHCheesePizza();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
        return cheesePizza;
    }

    @Override
    protected AbstractPizza createGreakPizza() {
        SHGreakPizza cheesePizza = new SHGreakPizza();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
        return cheesePizza;
    }
}
