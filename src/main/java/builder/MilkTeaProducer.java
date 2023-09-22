package builder;

public class MilkTeaProducer {

    private IMilkTeaBuilder builder;

    public MilkTea buildHotMilkTea(){
        builder = new HotMilkTeaBuilder();
        builder.buildMilk();
        builder.buildTea();
        builder.buildWater();
        return builder.build();
    }

    public MilkTea buildIceMilkTea(){
        builder = new IceMilkTeaBuilder();
        builder.buildMilk();
        builder.buildTea();
        builder.buildWater();
        return builder.build();
    }
}
