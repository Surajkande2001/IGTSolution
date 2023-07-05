import java.util.Scanner;

 

class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter number 1: ");
        a = sc.nextInt();

 

        System.out.print("Enter number 2: ");
        b = sc.nextInt();

        if(a > b) {
            System.out.println("Number 1 is greater: " + a);
        } else {
            System.out.println("Number 2 is greater: " + b);
        }
    }
}