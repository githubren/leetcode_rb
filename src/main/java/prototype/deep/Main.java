package prototype.deep;

public class Main {

    public static void main(String[] args){
        Person person1 = new Person("张三",22,new Boy("张三boy",22));
        Person person2 = (Person) person1.clone();

        System.out.println("person1 hashcode:"+person1.hashCode());
        System.out.println("person2 hashcode:"+person2.hashCode());

        System.out.println("person1 boy hashcode:"+person1.getBoy().hashCode());
        System.out.println("person2 boy hashcode:"+person2.getBoy().hashCode());

        person2.getBoy().setName("李四boy");

        System.out.println("person1 boy name:"+person1.getBoy().getName());
        System.out.println("person2 boy name:"+person2.getBoy().getName());
    }
}
