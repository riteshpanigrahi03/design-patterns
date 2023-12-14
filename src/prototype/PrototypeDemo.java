package prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee("Rahul", 30, "Mumbai", "Software Engineer2");
        System.out.println(employee);
        Employee employeeClone = (Employee) employee.clone();
        employeeClone.setAge(25);
        employeeClone.setDesignation("Junior Software Engineer");
        System.out.println(employeeClone);
    }
}
