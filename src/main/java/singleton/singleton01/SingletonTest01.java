package singleton.singleton01;

/**
 * 饿汉式单例
 * 优点：类加载时就创建了变量对象，避免了线程同步问题；
 * 缺点：如果一直没用到这个实例，那么造成内存浪费，没有实现懒加载。
 */
public class SingletonTest01 {

    //单例模式第一步：私有化构造函数，让外部无法通过new来创建对象。
    private SingletonTest01() {}

    private final static SingletonTest01 instance = new SingletonTest01();

    public static SingletonTest01 getInstance(){
        return instance;
    }
}
