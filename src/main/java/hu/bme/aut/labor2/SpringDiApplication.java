package hu.bme.aut.labor2;

import hu.bme.aut.labor2.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDiApplication implements CommandLineRunner {
    @Autowired
    private SalaryService salaryService;
    static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(1L, "Kovács Péter", 450_000, LocalDateTime.of(2005, 5, 1, 8, 0, 0));
        System.out.println("Alkalmazott emelés előtt: " + employee.toString());
        salaryService.setNewSalary(employee);
        System.out.println("Alkalmazott emelés után: " + employee.toString());
    }
}