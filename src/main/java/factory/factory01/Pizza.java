package factory.factory01;

/**
 * Pizza抽象基类，定义Pizza制作过程中的方法，具体实现在各种口味Pizza的子类中去实现
 */
public abstract class Pizza {

    public void make(){
        bake();
        cut();
        box();
    }

    /**
     * 烘焙
     */
    protected abstract void bake();

    /**
     * 分割
     */
    protected abstract void cut();

    /**
     * 包装
     */
    protected abstract void box();
}
