package prototype.deep;

public class Person implements Cloneable{

    private String name;

    private int age;

    private Boy boy;

    public Person(String name, int age, Boy boy) {
        this.name = name;
        this.age = age;
        this.boy = boy;
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

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    @Override
    protected Object clone()  {
        Object person;
        try{
            person = super.clone();
            Person clonePerson = (Person) person;
            clonePerson.setBoy((Boy)clonePerson.getBoy().clone());
            return clonePerson;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
