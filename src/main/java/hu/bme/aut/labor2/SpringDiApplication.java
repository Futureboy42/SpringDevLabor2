package hu.bme.aut.labor2;

import hu.bme.aut.labor2.employee.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SpringDiApplication {
    static void main() {
        try(var ctx = new ClassPathXmlApplicationContext("spring.xml")) {
            SalaryService salaryService = ctx.getBean(SalaryService.class);
            Employee employee = new Employee(1L, "Kovács Péter", 500000, LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0, 0));
            System.out.println("emelés előtt:" + employee.getSalary());
            salaryService.setNewSalary(employee);
            System.out.println("emelés után:" + employee.getSalary());
        }
    }
}