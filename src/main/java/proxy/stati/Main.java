package proxy.stati;

public class Main {

    public static void main(String[] args) {
        IRentHouse rentHouse = new RentHouse();
        IntermediaryProxy proxy = new IntermediaryProxy(rentHouse);
        proxy.rentHouse();
    }
}
