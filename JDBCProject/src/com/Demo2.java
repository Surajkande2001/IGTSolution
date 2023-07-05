package com;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    //private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    //private static final String DB_USER = "username";
    //private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IGT1","root","@#Shubham1");
            Statement stmt = con.createStatement();
            Scanner scanner = new Scanner(System.in);

            // Create table if it doesn't exist
            String createTableQuery = "CREATE TABLE IF NOT EXISTS employees (id INT AUTO_INCREMENT, role VARCHAR(255), name VARCHAR(255), PRIMARY KEY (id))";
            stmt.executeUpdate(createTableQuery);

            // Menu options
            System.out.println("Menu:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            // Handle user input
            int choice;
            do {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1: // Create
                        System.out.println("Enter role (cleark, developer, manager, tester): ");
                        String role = scanner.nextLine();
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        String insertQuery = "INSERT INTO employees (role, name) VALUES ('" + role + "', '" + name + "')";
                        stmt.executeUpdate(insertQuery);
                        System.out.println("Data inserted successfully.");
                        break;
                    case 2: // Read
                        String selectQuery = "SELECT * FROM employees";
                        ResultSet rs = stmt.executeQuery(selectQuery);
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String empRole = rs.getString("role");
                            String empName = rs.getString("name");
                            System.out.println("ID: " + id + ", Role: " + empRole + ", Name: " + empName);
                        }
                        rs.close();
                        break;
                    case 3: // Update
                        System.out.println("Enter the ID of the employee to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.println("Enter new name: ");
                        String newName = scanner.nextLine();
                        String updateQuery = "UPDATE employees SET name = '" + newName + "' WHERE id = " + updateId;
                        stmt.executeUpdate(updateQuery);
                        System.out.println("Data updated successfully.");
                        break;
                    case 4: // Delete
                        System.out.println("Enter the ID of the employee to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        String deleteQuery = "DELETE FROM employees WHERE id = " + deleteId;
                        stmt.executeUpdate(deleteQuery);
                        System.out.println("Data deleted successfully.");
                        break;
                    case 5: // Exit
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } while (choice != 5);

            stmt.close();
            con.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
