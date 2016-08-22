import java.util.ArrayList;

public class EmplService {
    private ArrayList <Employee> company = new ArrayList<Employee>();

    public ArrayList<Employee> getCompany() {
        return company;
    }

    public void getManagerByName(String name) {
        for (Employee employee : company) {
            if (name.equals(employee.getName())) {
                if (employee.getManager() != null) {
                    System.out.println(employee.getManager().getName());
                    getManagerByName(employee.getManager().getName());
                }
            }
        }
    }
}
