// Package's reference
package br.com.enterprise.model;

// Employee Manager
public class Manager extends Employee implements Authenticable {
    // Attributes
    private String user;
    private String password;
    private static final double bonuses = 0.2;
    private static final double extra_bonuses = 1000.0;

    // Get user
    public String getUser() {
        return user;
    }

    // Get user
    public String getPassword() {
        return password;
    }

    // Builder
    public Manager(String name, double salary, String user, String password) {
        super(name, salary);
        this.user = user;
        this.password = password;
    }

    // Method for calculating annual employee bonuses
    @Override
    public double calculateAnnualBonuses() {
        return (super.getSalary() * bonuses) + extra_bonuses;
    }

    // Method for authenticate manager's user and password
    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}