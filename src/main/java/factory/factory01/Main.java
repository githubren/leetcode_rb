package factory.factory01;

public class Main {

    public static void main(String[] args){
        SimplePizzaFactory.createPizza("cheese");
        System.out.println("********************");
        SimplePizzaFactory.createPizza("greak");
    }
}
