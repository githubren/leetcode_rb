package proxy.dynamic;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        JDKDynamicProxy catProxy = new JDKDynamicProxy(new Cat());
        Animals cat = (Animals) Proxy.newProxyInstance(catProxy.getClass().getClassLoader(),new Class[]{Animals.class},catProxy);
        cat.sound();
        cat.eat();

        JDKDynamicProxy dogProxy = new JDKDynamicProxy(new Dog());
        Animals dog = (Animals) Proxy.newProxyInstance(dogProxy.getClass().getClassLoader(),new Class[]{Animals.class},dogProxy);
        dog.sound();
        dog.eat();

        System.out.println("*************************");

        CglibProxy proxy = new CglibProxy(new Cat());
        CglibProxy proxy1 = new CglibProxy(new Dog());

        Animals cat1 = (Animals) proxy.getProxy();
        Animals dog1 = (Animals) proxy1.getProxy();

        cat1.sound();
        cat1.eat();

        dog1.sound();
        dog1.eat();
    }
}
