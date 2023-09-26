package bridge;

public class Asus extends Computer{

    private CPU mCpu;

    public Asus(CPU cpu) {
        super(cpu);
        mCpu = cpu;
    }

    public void setCpu(CPU cpu){
        mCpu = cpu;
    }

    @Override
    protected void run() {
        System.out.println("华硕电脑搭载"+mCpu.structure());
    }
}
