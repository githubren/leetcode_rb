package facade;

public class Main {

    public static void main(String[] args) {
        PhoneFacade phoneFacade = new PhoneFacade(new WindowManager(),new Canvas(),new EventManager());
        phoneFacade.init();
        System.out.println("*******************");
        phoneFacade.clear();
    }
}
