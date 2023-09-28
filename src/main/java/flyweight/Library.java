package flyweight;

public abstract class Library {

    private String mBook;

    public Library(String name) {
        this.mBook = name;
    }

    public String getName() {
        return mBook;
    }

    public void setName(String mName) {
        this.mBook = mName;
    }

    protected abstract void browser(User user);
}
