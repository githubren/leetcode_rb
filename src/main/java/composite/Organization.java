package composite;

public abstract class Organization {

    private String mName;

    public Organization(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    protected void addOrganization(Organization organization){}

    protected void removeOrganization(Organization organization){}

    protected abstract void print();
}
