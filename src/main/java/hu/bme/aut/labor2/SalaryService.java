package hu.bme.aut.labor2;

import hu.bme.aut.labor2.employee.Employee;
import hu.bme.aut.labor2.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private EmployeeService employeeService;

    public void setNewSalary(Employee employee) {
        int payRaisePercent = employeeService.getPayRaisePercent(employee);
        employee.setSalary( employee.getSalary()*payRaisePercent/100 + employee.getSalary() );
    }
}
