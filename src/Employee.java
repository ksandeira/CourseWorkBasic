import java.util.Objects;

public class Employee {
    private static int counter = 1;
    private final int id;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public boolean setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return"Employee{" + "id=" + id + ", name='" + fullName + "' , dept=" + department + ", salary="+salary + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(salary, employee.salary) == 0 &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }
}

