package hu.bme.aut.labor2;

import hu.bme.aut.labor2.employee.Employee;
import hu.bme.aut.labor2.employee.EmployeeService;

public class SalaryService {

    private EmployeeService employeeService;
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void setNewSalary(Employee employee) {
        int payRaisePercent = employeeService.getPayRaisePercent(employee);
        employee.setSalary(payRaisePercent);
    }
}
