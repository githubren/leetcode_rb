package singleton.singleton03;


/**
 * 静态内部类创建单例对象
 * SingletonTest03类在装载的时候，静态内部类SingletonHolder不会装载，只有在调用方法获取实例时才会去装载
 * 静态内部类在装载时是线程安全的
 */
public class SingletonTest03 {

    /**
     * 私有化构造方法，防止外部通过new来创建对象
     */
    private SingletonTest03(){

    }

    public static SingletonTest03 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final SingletonTest03 INSTANCE = new SingletonTest03();
    }
}
