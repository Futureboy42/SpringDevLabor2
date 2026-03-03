package hu.bme.aut.labor2.employee;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("smart")
public class SmartEmployeeService implements EmployeeService {

    @Override
    public int getPayRaisePercent(Employee employee) {
        return 20;
    }
}
