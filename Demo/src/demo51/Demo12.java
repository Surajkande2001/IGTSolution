package demo51;

import java.util.Scanner;



class Emp {

 

    int id;
    String name;

    Scanner sc = new Scanner(System.in);

 

    Emp() {

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
    }
}

 

class Cle extends Emp {

 

    Cle() {

    }

 

    void display() {

 

        System.out.println("ID: " + id);
        System.out.println("Name" + name);
    }
}

 

class Dev extends Emp {

 

    Dev() {

    }

 

    void display() {

 

        System.out.println("ID: " + id);
        System.out.println("Name" + name);
    }
}

 

class Test extends Emp {

 

    Test() {

    }

 

    void display() {

 

        System.out.println("ID: " + id);
        System.out.println("Name" + name);
    }
}

 

class Demo12 {

 

    public static void main(String[] args) {

        Cle c = new Cle();
        c.display();

 

        Dev d = new Dev();
        d.display();

 

        Test t = new Test();
        t.display();
    }
}