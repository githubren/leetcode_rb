package builder;

public class Main {

    public static void main(String[] args){
        MilkTeaProducer producer = new MilkTeaProducer();
        producer.buildHotMilkTea();
        System.out.println("*****************");
        producer.buildIceMilkTea();
    }
}
