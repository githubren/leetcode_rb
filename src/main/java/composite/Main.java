package composite;

public class Main {

    public static void main(String[] args) {
        Organization university = new University("清华大学");

        Organization college1 = new College("机电学院");
        Organization college2 = new College("土木学院");

        Organization department1 = new Department("机电工程1");
        Organization department2 = new Department("机电工程2");
        Organization department3 = new Department("土木工程1");
        Organization department4 = new Department("土木工程2");

        college1.addOrganization(department1);
        college1.addOrganization(department2);

        college2.addOrganization(department3);
        college2.addOrganization(department4);

        university.addOrganization(college1);
        university.addOrganization(college2);

        university.print();
    }
}
