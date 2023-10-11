package template;

public class Main {

    public static void main(String[] args) {
        PearlMilkTea pearlMilkTea = new PearlMilkTea();
        pearlMilkTea.make();

        System.out.println("********************");

        CoconutMilkTea coconutMilkTea = new CoconutMilkTea();
        coconutMilkTea.make();
    }

}
