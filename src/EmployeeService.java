public class EmployeeService {
    private final Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculateTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                    minEmployee = employee;
                }
            }
        }
        return minEmployee;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                    maxEmployee = employee;
                }
            }
        }
        return maxEmployee;
    }

    public double calculateAverageSalary() {
        int total = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count > 0 ? (double) total / count : 0;
    }

    public void printAllEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
