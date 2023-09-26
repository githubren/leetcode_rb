package decorator;

public abstract class NoodlesDecorator extends Noodles{

    private Noodles mNoodles;

    public NoodlesDecorator(Noodles noodles) {
        this.mNoodles = noodles;
    }

    @Override
    protected void make() {
        mNoodles.make();
    }

    protected abstract void add();
}
