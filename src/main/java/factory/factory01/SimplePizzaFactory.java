package factory.factory01;

public class SimplePizzaFactory {

    private static Pizza mPizza;

    public static Pizza createPizza(String type){
        switch (type){
            case "cheese":
                mPizza = new CheesePizza();
                break;
            case "greak":
                mPizza = new GreakPizza();
                break;
        }
        mPizza.make();
        return mPizza;
    }
}
