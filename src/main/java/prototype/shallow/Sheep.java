package prototype.shallow;

public class Sheep implements Cloneable{

    private String name;

    private int age;

    private Sheep friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheep;
    }
}
