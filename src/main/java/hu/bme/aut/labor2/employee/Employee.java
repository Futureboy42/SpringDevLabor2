package hu.bme.aut.labor2.employee;

import java.time.LocalDateTime;

public class Employee {

    private Long id;
    private String name;
    private int salary;
    private LocalDateTime workStart;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", workStart=" + workStart +
                '}';
    }

    public Employee(Long id, String name, int salary, LocalDateTime workStart) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDateTime getWorkStart() {
        return workStart;
    }

    public void setWorkStart(LocalDateTime workStart) {
        this.workStart = workStart;
    }
}
