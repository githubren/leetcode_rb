package proxy.stati;

public class IntermediaryProxy implements IRentHouse{

    private final IRentHouse mRentHouse;

    public IntermediaryProxy(IRentHouse rentHouse) {
        mRentHouse = rentHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("寻找中介代理");
        mRentHouse.rentHouse();
        System.out.println("中介后期房屋维护");
    }
}
