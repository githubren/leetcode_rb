package proxy.dynamic;

public class Dog implements Animals{

    @Override
    public void sound() {
        System.out.println("小狗汪汪汪~");
    }

    @Override
    public void eat() {
        System.out.println("小狗吃狗粮");
    }
}
