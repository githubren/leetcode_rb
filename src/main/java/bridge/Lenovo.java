package bridge;

public class Lenovo extends Computer{

    private CPU mCpu;

    public Lenovo(CPU cpu) {
        super(cpu);
        mCpu = cpu;
    }

    public void setCpu(CPU cpu){
        mCpu = cpu;
    }

    @Override
    protected void run() {
        System.out.println("联想电脑搭载"+mCpu.structure());
    }
}
