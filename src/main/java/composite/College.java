package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization{

    private final List<Organization> mOrganizations = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    protected void addOrganization(Organization organization) {
        super.addOrganization(organization);
        mOrganizations.add(organization);
    }

    @Override
    protected void removeOrganization(Organization organization) {
        super.removeOrganization(organization);
        mOrganizations.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("  *********"+getName()+"*********  ");
        for (Organization organization : mOrganizations) {
            organization.print();
        }
    }
}
