// Package's reference
package br.com.enterprise.model;

// Employee Programmer
public class Programmer extends Employee {
    // Attributes
    private static final double bonuses = 0.1;

    // Builder
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    // Method for calculating annual employee bonuses
    @Override
    public double calculateAnnualBonuses() {
        return super.getSalary() * bonuses;
    }
}
