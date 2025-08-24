public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Журавлев Игорь Александрович", 1, 42000);
        employees[1] = new Employee("Боброва Евгения Викторовна", 2, 43500);
        employees[2] = new Employee("Мыслин Ярослав Владимирович", 3, 40000);
        employees[3] = new Employee("Гордеева Марина Петровна", 4, 39000);
        employees[4] = new Employee("Афонин Сергей Валерьевич", 5, 65000);
        employees[5] = new Employee("Морозова Татьяна Игоревна", 1, 62000);
        employees[6] = new Employee("Козырева Ирина Васильевна", 2, 59000);
        employees[7] = new Employee("Дуброва Елена Вячеславовна", 3, 55000);
        employees[8] = new Employee("Рыкова Мария Витальевна", 4, 53000);
        employees[9] = new Employee("Ислентьева Дарья Вадимовна", 5, 57000);

        EmployeeService service = new EmployeeService(employees);

        System.out.println("Все сотрудники:");
        service.printAllEmployees();

        System.out.println("Сумма затрат на ЗП в рублях: " + service.calculateTotalSalary());

        System.out.println("Сотрудник с минимальной ЗП в рублях: " + service.findEmployeeWithMinSalary());

        System.out.println("Сотрудник с максимальной ЗП в рублях: " + service.findEmployeeWithMaxSalary());

        System.out.println("Средняя ЗП в рублях: " + service.calculateAverageSalary());

        System.out.println("ФИО всех сотрудников:");
        service.printAllEmployeesNames();
    }
}