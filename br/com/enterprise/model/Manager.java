package br.com.enterprise.model;

public class Manager extends Employee {
    // Attributes
    private final double bonuses;

    // Builder
    public Manager(String name, double salary) {
        super(name, salary);
        bonuses = 0.2;
    }

    // Method for calculating annual employee bonuses
    public double calculateAnnualBonuses() {
        return super.getSalary() * (1 + bonuses) + 1000.0;
    }
}