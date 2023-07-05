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

 

 

class demo10 {

 

    public static void main(String[] Args) {

 

        Clerk c = new Clerk();
        Developer d = new Developer();
        Manager m = new Manager();
        Tester t = new Tester();

 

      //  c.display();
     //   d.display();
     //   m.display();
     //   t.display();

 

    int choice;
    System.out.println("enter choice 1,2, 3, 4: ");
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();

 

    switch(choice){
    case 1:
    c.display();
    break;

 

    case 2:
    d.display();
    break;

 

    case 3:
    m.display();
    break;

 

    case 4:
    t.display();
    break;
}
    }
}