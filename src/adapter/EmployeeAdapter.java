package adapter;

public class EmployeeAdapter implements EmployeeNew {
    private EmployeeOld employeeOld;

    public EmployeeAdapter(EmployeeOld employeeOld) {
        this.employeeOld = employeeOld;
    }

    @Override
    public String getEmployeeName() {
        return employeeOld.getEmployeeInfo().split(" - ")[0];
    }

    @Override
    public String getEmployeeDesignation() {
        return employeeOld.getEmployeeInfo().split(" - ")[1];
    }
}
