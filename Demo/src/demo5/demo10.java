import java.util.Scanner;

import src.main.a.Clerk;

 

class Clerk {
    Scanner read = new Scanner(System.in);
    int id;
    String name;
    int age;
    double salary;
    String designation;

 

    Clerk() {
        System.out.println("Enter Clerk details:");
        System.out.print("ID: ");
        id = read.nextInt();
        read.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Age: ");
        age = read.nextInt();
        System.out.print("Salary: ");
        salary = read.nextDouble();
        read.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        designation = read.nextLine();
    }

 

    void display() {
        System.out.println("Clerk Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

 

class demo10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice;

 

        System.out.println("Choose an option:");
        System.out.println("1. Clerk");
        System.out.println("2. Developer");
        System.out.println("3. Manager");
        System.out.println("4. Tester");
        System.out.print("Enter your choice: ");
        choice = read.nextInt();

 

        switch (choice) {
            case 1:
                Clerk clerk = new Clerk();
                clerk.display();
                break;
            case 2:
                Clerk dev = new Clerk();
                dev.display();
                break;
            case 3:
                Clerk manager = new Clerk();
                manager.display();
                break;
            case 4:
                Clerk tester = new Clerk();
                tester.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
