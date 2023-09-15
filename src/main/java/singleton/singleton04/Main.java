package singleton.singleton04;

public class Main {

    public static void main(String[] args){
        SingletonTest04 instance01 = SingletonTest04.INSTANCE;
        SingletonTest04 instance02 = SingletonTest04.INSTANCE;
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
        instance01.hello();
    }

}
