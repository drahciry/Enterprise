package br.com.enterprise.model;
import br.com.enterprise.exceptions.InvalidValuePercentageException;

public abstract class Employee {
    // Attributes
    private final String name;
    private double salary;

    // Builder
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get salary
    public double getSalary() {
        return salary;
    }

    // Set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method for increase salary
    public void receiveIncrease(double percentage) {
        if (percentage <= 0){
            throw new InvalidValuePercentageException("Invalid percentage. The percentage must be positive.");
        } else if (percentage > 1){
            throw new InvalidValuePercentageException("Invalid percentage. The percentage is too high.");
        }
        salary *= 1 + (percentage / 100);
    }

    // Abstract method for calculating annual employee bonuses
    public abstract double calculateAnnualBonuses();
}