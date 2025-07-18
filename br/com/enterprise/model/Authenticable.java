// Package's reference
package br.com.enterprise.model;

// Interface for authenticate user
public interface Authenticable {
    // Method for authenticate user and password
    boolean authenticate(String password);
}
