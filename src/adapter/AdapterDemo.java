package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeOld employeeOld = new EmployeeOld();
        EmployeeNew employeeNew = new EmployeeAdapter(employeeOld);
        System.out.println(employeeNew.getEmployeeName());
        System.out.println(employeeNew.getEmployeeDesignation());
    }
}
