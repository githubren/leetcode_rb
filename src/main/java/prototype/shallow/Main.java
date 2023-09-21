package prototype.shallow;

public class Main {

    public static void main(String[] args){
        Sheep sheep1 = new Sheep("喜羊羊",1);
        sheep1.setFriend(new Sheep("懒羊羊",1));
        Sheep sheep2 = (Sheep) sheep1.clone();


        System.out.println("sheep1 hashcode:"+sheep1.hashCode());
        System.out.println("sheep2 hashcode:"+sheep2.hashCode());

        System.out.println("sheep1 friend hashcode:"+sheep1.getFriend().hashCode());
        System.out.println("sheep2 friend hashcode:"+sheep2.getFriend().hashCode());

        sheep2.getFriend().setName("美羊羊");
        System.out.println("sheep1 friend name:"+sheep1.getFriend().getName());
        System.out.println("sheep2 friend name:"+sheep2.getFriend().getName());
    }
}
