import java.util.Scanner;

 

class Clerk {

    int id;
    String name;
    int age;
    int salery;
    String desig;

 

    Clerk() {

 

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Salery: ");
        salery = sc.nextInt();
        System.out.print("Desig: ");
        desig = sc.next();
    }

 

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salery: " + salery);
        System.out.println("Designation: " + desig);
    }
}

 

class Developer {

    int id;
    String name;
    int age;
    int salery;
    String desig;

 

    Developer() {

 

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Salery: ");
        salery = sc.nextInt();
        System.out.print("Desig: ");
        desig = sc.next();
    }

 

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salery: " + salery);
        System.out.println("Designation: " + desig);
    }
}

 

class Manager {

    int id;
    String name;
    int age;
    int salery;
    String desig;

 

    Manager() {

 

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Salery: ");
        salery = sc.nextInt();
        System.out.print("Desig: ");
        desig = sc.next();
    }

 

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salery: " + salery);
        System.out.println("Designation: " + desig);
    }
}

 

class Tester {

    int id;
    String name;
    int age;
    int salery;
    String desig;

 

    Tester() {

 

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Salery: ");
        salery = sc.nextInt();
        System.out.print("Desig: ");
        desig = sc.next();
    }

 

    void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salery: " + salery);
        System.out.println("Designation: " + desig);
    }
}

 

class demo2 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

 

        System.out.print("Enter your choice: ");
        int c = sc.nextInt();

        if(c == 1) {
            Clerk cl = new Clerk();
            cl.display();
        }
        else if(c == 2) {
            Developer d = new Developer();
            d.display();
        }
        else if(c == 3) {
            Manager m = new Manager();
            m.display();
        }
        else {
            Tester t = new Tester();
            t.display();
        }
    }
}