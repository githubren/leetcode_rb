package flyweight;

public class LibraryManager extends Library{

    public LibraryManager(String name) {
        super(name);
    }

    @Override
    protected void browser(User user) {
        System.out.println("姓名："+user.getName()+"  年龄："+user.getAge()+"  借阅书籍：<<"+getName()+">>");
    }
}
