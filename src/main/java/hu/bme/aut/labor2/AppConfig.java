package hu.bme.aut.labor2;

import hu.bme.aut.labor2.employee.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hu.bme.aut.labor2")
public class AppConfig {
    @Bean
    public SalaryService salaryService(EmployeeService employeeService) {
        SalaryService salaryService = new SalaryService();
        salaryService.setEmployeeService(employeeService);
        return salaryService;
    }
}