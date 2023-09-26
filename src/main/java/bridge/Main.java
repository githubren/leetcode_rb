package bridge;

public class Main {

    public static void main(String[] args){
        Asus asus = new Asus(new CoreI3());
        asus.run();
        asus.setCpu(new CoreI5());
        asus.run();
        System.out.println("****************");
        Lenovo lenovo = new Lenovo(new CoreI3());
        lenovo.run();
        lenovo.setCpu(new CoreI5());
        lenovo.run();
    }
}
