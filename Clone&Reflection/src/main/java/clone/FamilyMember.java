package clone;

public class FamilyMember implements Cloneable {
    private String name;
    private int age;
    private FamilyMember father;

    public FamilyMember(String name, int age, FamilyMember father) {
        this.name = name;
        this.age = age;
        this.father = father;
    }

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FamilyMember getFather() {
        return father;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FamilyMember familyMember = (FamilyMember) super.clone();
        if (familyMember.getFather() != null)
            familyMember.setFather((FamilyMember) familyMember.getFather().clone());
        return familyMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyMember that = (FamilyMember) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return father != null ? father.equals(that.father) : that.father == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (father != null ? father.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", father=" + father +
                '}';
    }
}