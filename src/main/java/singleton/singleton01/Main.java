package singleton.singleton01;

public class Main {

    public static void main(String[] args){
        SingletonTest01 singletonTest01_1 = SingletonTest01.getInstance();
        SingletonTest01 singletonTest01_2 = SingletonTest01.getInstance();
        System.out.println(singletonTest01_1.equals(singletonTest01_2));
        System.out.println(singletonTest01_1 == singletonTest01_2);
        System.out.println(singletonTest01_1.hashCode());
        System.out.println(singletonTest01_2.hashCode());
    }
}
