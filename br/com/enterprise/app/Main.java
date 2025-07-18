// Package's reference
package br.com.enterprise.app;

// Imports
import br.com.enterprise.model.Programmer;
import br.com.enterprise.model.Employee;
import br.com.enterprise.model.Manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class for run code
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> team = new ArrayList<>();
        team.add(new Manager("Richard Gonçalves", 12540.60, "drahciry", "12345678"));
        team.add(new Programmer("Carlos Mota", 18700.90));
        team.add(new Programmer("Alison Coutinho", 1500.00));

        DisplayTeam.displayTeam(team);
        Authenticate.authenticate(scanner, team);

        scanner.close();
    }

    // Static class for display all team and infos
    public static class DisplayTeam {
        // Method for display all team and infos
        public static void displayTeam(List<Employee> team) {
            System.out.println("Funcionários cadastrados:\n");
            for (Employee e : team) {
                System.out.printf(
                        "Position: %s | Name: %s | Salary: %.2f | Bonuses: R$ %.2f%n",
                        e instanceof Manager ? "Manager" : "Programmer",
                        e.getName(), e.getSalary(), e.calculateAnnualBonuses()
                );
            }
            System.out.println();
        }
    }

    // Static class for authenticate
    public static class Authenticate {
        // Method for authenticate managers
        public static void authenticate(Scanner scanner, List<Employee> team) {
            for (Employee e : team) {
                if (!(e instanceof Manager)) continue;
                Manager manager = (Manager) e;
                System.out.printf("User: %s%nPassword: ", manager.getUser());
                String password = scanner.nextLine();
                if (manager.authenticate(password)) System.out.println("Authenticate with successfull!\n");
                else System.out.println("Authenticate failed!\n");
            }
        }
    }
}
