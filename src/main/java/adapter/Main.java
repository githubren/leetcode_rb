package adapter;

import adapter.clz.Phone;
import adapter.clz.Voltage5VAdapter;
import adapter.itf.AbsInterfaceAdapter;
import adapter.obj.Phone2;
import adapter.obj.Voltage220V;

public class Main {

    public static void main(String[] args){
        Phone phone = new Phone();
        phone.charging(new Voltage5VAdapter());
        System.out.println("******************");
        Phone2 phone2 = new Phone2();
        phone2.charging(new adapter.obj.Voltage5VAdapter(new Voltage220V()));
        System.out.println("******************");
        AbsInterfaceAdapter adapter = new AbsInterfaceAdapter() {
            @Override
            public void f1() {
                super.f1();
                System.out.println("外部只实现f1方法");
            }
        };
        adapter.f1();
    }

}
