package InternalExam;

import java.util.List;

public class PayrollSystem {
    public void processPayroll(List<Employee> employees) {
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("Paying " + employee.getName() + " (" + employee.getEmployeeId() + ") $" + pay);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new SalariedEmployee("John Doe", "E001", 3000),
            new HourlyEmployee("Jane Smith", "E002", 160, 20)
        );

        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.processPayroll(employees);
    }
}

