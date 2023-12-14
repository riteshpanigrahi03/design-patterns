package prototype;

public class Employee implements Cloneable {
    private String name;
    private Integer age;
    private String address;
    private String designation;

    public Employee() {
    }

    public Employee(String name, Integer age, String address, String designation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employee(this.name, this.age, this.address, this.designation);
    }
}
