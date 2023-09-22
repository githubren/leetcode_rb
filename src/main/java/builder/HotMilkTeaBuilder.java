package builder;

public class HotMilkTeaBuilder implements IMilkTeaBuilder{

    private final MilkTea milkTea = new MilkTea();

    @Override
    public void buildMilk() {
        System.out.println("制作奶茶——放入牛奶");
        milkTea.setMilk("牛奶");
    }

    @Override
    public void buildTea() {
        System.out.println("制作奶茶——放入茶");
        milkTea.setMilk("茶");
    }

    @Override
    public void buildWater() {
        System.out.println("制作奶茶——放入热水");
        milkTea.setMilk("热水");
    }

    @Override
    public MilkTea build() {
        System.out.println("奶茶制作完成");
        return milkTea;
    }
}
