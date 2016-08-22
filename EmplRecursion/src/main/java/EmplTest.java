public class EmplTest {

    public static void main(String[] args) {
        EmplService service = new EmplService();


        Employee empl1 = new Employee("1");
        Employee empl2 = new Employee("2", empl1);
        Employee empl3 = new Employee("3", empl1);
        Employee empl4 = new Employee("4", empl2);
        Employee empl5 = new Employee("5", empl2);
        Employee empl6 = new Employee("6", empl3);
        Employee empl7 = new Employee("7", empl3);

        service.getCompany().add(empl1);
        service.getCompany().add(empl2);
        service.getCompany().add(empl3);
        service.getCompany().add(empl4);
        service.getCompany().add(empl5);
        service.getCompany().add(empl6);
        service.getCompany().add(empl7);


        service.getManagerByName("4");

    }
}
