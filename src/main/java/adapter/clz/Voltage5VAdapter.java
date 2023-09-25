package adapter.clz;

public class Voltage5VAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int out() {
        return output()/44;
    }
}
