package factory.factory02;

public class GreakPizzaFactory extends PizzaFactory{

    @Override
    protected Pizza createPizza() {
        GreakPizza pizza = new GreakPizza();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
