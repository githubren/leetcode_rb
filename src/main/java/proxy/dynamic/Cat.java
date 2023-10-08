package proxy.dynamic;

public class Cat implements Animals{

    @Override
    public void sound() {
        System.out.println("小猫喵喵喵~");
    }

    @Override
    public void eat() {
        System.out.println("小猫吃猫粮");
    }
}
