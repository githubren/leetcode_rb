package flyweight;

public class Main {

    public static void main(String[] args) {
        LibraryFactory libraryFactory = new LibraryFactory();
        libraryFactory.browse("十万个为什么",new User("张三",27));
    }
}
