package template;

public abstract class AbstractMilkTea {

    //模板中不需要子类覆盖的方法用final修饰
    final void make(){
        addMilk();
        addTea();
        addWater();
        addCondiment();
    }

    private void addMilk(){
        System.out.println("添加牛奶");
    }

    private void addTea(){
        System.out.println("添加茶水");
    }

    private void addWater(){
        System.out.println("添加清水");
    }

    abstract void addCondiment();
}
