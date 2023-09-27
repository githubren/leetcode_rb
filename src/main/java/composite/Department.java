package composite;


public class Department extends Organization{

    public Department(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("    *******"+getName()+"*******    ");
    }
}
