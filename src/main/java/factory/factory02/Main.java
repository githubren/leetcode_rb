package factory.factory02;


public class Main {

    public static void main(String[] args){
        CheesePizzaFactory pizzaFactory = new CheesePizzaFactory();
        pizzaFactory.createPizza();
        System.out.println("********************");
        GreakPizzaFactory greakPizzaFactory = new GreakPizzaFactory();
        greakPizzaFactory.createPizza();
    }
}
