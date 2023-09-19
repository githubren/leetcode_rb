package factory.factory02;

public class CheesePizzaFactory extends PizzaFactory{

    @Override
    protected Pizza createPizza() {
        CheesePizza pizza = new CheesePizza();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
