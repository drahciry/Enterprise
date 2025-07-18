package br.com.enterprise.model;

public class Manager extends Employee implements Authenticable {
    // Attributes
    private String user;
    private String password;
    private final double bonuses;

    // Get user
    public String getUser() {
        return user;
    }

    // Set user
    public void setUser(String user) {
        this.user = user;
    }

    // Get user
    public String getPassword() {
        return password;
    }

    // Set password
    public void setPassword(String password) {
        this.password = password;
    }

    // Builder
    public Manager(String name, double salary, String user, String password) {
        super(name, salary);
        this.user = user;
        this.password = password;
        bonuses = 0.2;
    }

    // Method for calculating annual employee bonuses
    @Override
    public double calculateAnnualBonuses() {
        return super.getSalary() * (1 + bonuses) + 1000.0;
    }

    // Method for authenticate manager's user and password
    @Override
    public boolean authenticate(String user, String password) {
        return this.user.equals(user) && this.password.equals(password);
    }
}