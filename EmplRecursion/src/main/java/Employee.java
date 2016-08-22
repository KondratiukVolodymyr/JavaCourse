
public class Employee {

    private String name;
    private Employee manager;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
