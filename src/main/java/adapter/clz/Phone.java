package adapter.clz;

public class Phone {

    public void charging(Voltage5VAdapter adapter){
        if (adapter.out() > 5){
            System.out.println("电压不对，无法充电");
        }else {
            System.out.println("充电中。。。");
        }
    }

}
