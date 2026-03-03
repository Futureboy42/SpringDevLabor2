package hu.bme.aut.labor2.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!smart")
public class DefaultEmployeeService implements EmployeeService {
    @Value("${hr.payRaise.def}")
    private int defaultPayRaise;
    @Override
    public int getPayRaisePercent(Employee employee) {
        return defaultPayRaise;
    }
}