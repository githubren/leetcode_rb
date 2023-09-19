package factory.factory03;

public class BJPizzaFactory extends AbstractPizzaFactory{

    public BJPizzaFactory() {
        System.out.println("*******BJPizzaFactory*******");
    }

    @Override
    protected AbstractPizza createCheesePizza() {
        BJCheesePizza cheesePizza = new BJCheesePizza();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
        return cheesePizza;
    }

    @Override
    protected AbstractPizza createGreakPizza() {
        BJGreakPizza cheesePizza = new BJGreakPizza();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
        return cheesePizza;
    }
}
