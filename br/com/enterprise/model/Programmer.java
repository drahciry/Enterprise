package br.com.enterprise.model;

public class Programmer extends Employee {
    // Attributes
    private final double bonuses;

    // Builder
    public Programmer(String name, double salary) {
        super(name, salary);
        bonuses = 0.1;
    }

    // Method for calculating annual employee bonuses
    public double calculateAnnualBonuses() {
        return super.getSalary() * (1 + bonuses);
    }
}
