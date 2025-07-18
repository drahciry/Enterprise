package br.com.enterprise.model;

public interface Authenticable {
    // Method for authenticate user and password
    boolean authenticate(String user, String password);
}
