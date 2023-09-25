package adapter.obj;

public class Phone2 {

    public void charging(Voltage5VAdapter adapter){
        if (adapter.out() > 5){
            System.out.println("电压不对不能充电");
        }else {
            System.out.println("充电中...");
        }
    }

}
