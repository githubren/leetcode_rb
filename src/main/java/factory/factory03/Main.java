package factory.factory03;

public class Main {

    public static void main(String[] args){
        BJPizzaFactory bjPizzaFactory = new BJPizzaFactory();
        bjPizzaFactory.createCheesePizza();
        System.out.println("***********");
        bjPizzaFactory.createGreakPizza();

        SHPizzaFactory shPizzaFactory = new SHPizzaFactory();
        shPizzaFactory.createCheesePizza();
        System.out.println("***********");
        shPizzaFactory.createGreakPizza();
    }
}
