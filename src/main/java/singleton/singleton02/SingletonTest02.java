package singleton.singleton02;

/**
 * 懒汉式单例模式
 *  1、线程不安全；在外部调方法获取实例时，对私有变量判空，为空时才创建，然后返回给外部，这样实现了懒加载，但线程不安全。
 */
public class SingletonTest02 {

    private static volatile SingletonTest02 mInstance;

    //私有化构造器
    private SingletonTest02(){

    }

    /**
     * 实现了懒加载但线程不安全
     * @return
     */
    public static SingletonTest02 getInstance01(){
        if (mInstance == null){
            mInstance = new SingletonTest02();
        }
        return mInstance;
    }

    /**
     * 添加synchronized关键字保证方法线程安全，但每一个调用的线程在上一个线程还未完结时都会被阻塞，当大量线程调用时耗时
     * @return
     */
    public static synchronized SingletonTest02 getInstance02(){
        if (mInstance == null){
            mInstance = new SingletonTest02();
        }

        return mInstance;
    }

    /**
     * 线程不安全，一个线程进入到第一个if判断还未往下执行时，另一个线程也进入了if判断语句，此时两个线程同时到达synchronized，其中一个线程进去，另一个线程等待，
     * 当先进去那个线程创建完成，走出方法后，在线程共享变量还未得到更新但另一个线程又进入了方法的时候，此时就会创建第二个对象，所以是非线程安全的。
     * 要保证线程安全需在声明mInstance变量时加volatile关键字修饰，使得线程共享变量mInstance在线程读取时总会获得最新的状态，读总会发生在写之前。
     *
     * 双重检验锁创建单例对象满足了懒加载、线程安全、效率高等特点。
     * @return
     */
    public static SingletonTest02 getInstance03(){
        if (mInstance == null){
            synchronized (SingletonTest02.class){
                if (mInstance == null){
                    mInstance = new SingletonTest02();
                }
            }
        }
        return mInstance;
    }
}
