package singleton.singleton03;

public class Main {

    public static void main(String[] args){
        SingletonTest03 instance01 = SingletonTest03.getInstance();
        SingletonTest03 instance02 = SingletonTest03.getInstance();
        System.out.println(instance01 == instance02);
        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
    }
}
