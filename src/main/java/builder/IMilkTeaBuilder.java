package builder;

public interface IMilkTeaBuilder {

    void buildMilk();

    void buildTea();

    void buildWater();

    MilkTea build();
}
