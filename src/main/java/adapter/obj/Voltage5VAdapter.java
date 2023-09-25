package adapter.obj;

public class Voltage5VAdapter extends Voltage5V{

    private final Voltage220V voltage220V;

    public Voltage5VAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int out() {
        return voltage220V.output()/44;
    }
}
