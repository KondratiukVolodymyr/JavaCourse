import java.util.ArrayList;
import java.util.List;

public class EmplService {
    private List<Employee> company = new ArrayList<Employee>();
    private Employee currentEmployee;

    public List<Employee> getCompany() {
        return company;
    }

    public void getManagerByName(String name) {
        for (Employee employee : company) {
            if (name.equals(employee.getName())) {
                currentEmployee = employee;
            }
        }
        System.out.println("Employee's name: " + currentEmployee.getName());
        System.out.println("Managers:");
        managerRecursion(currentEmployee);
    }

    private void managerRecursion(Employee employee) {
        if (employee.getManager() != null) {
            System.out.println(employee.getManager().getName());
            managerRecursion(employee.getManager());
        }
    }
}
