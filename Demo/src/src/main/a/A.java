package src.main.a;

import java.utils.*;
class A 
{ 
      Scanner sc = new Scanner(system.in);
      A()
       {
           system.out.println("A class");
       }
       void abc()
       {

          system.out.print("Enter The A")
           int a = sc.nextInt();

           system.out.print("Enter The B")
            int b = sc.nextInt();
           
           system.out.print("Enter The C")
           int c = sc.nextInt();

         if (a>b && a > c)  
         System.out.println("The largest number is: "+a); 
         else if (b > a && b> c)  
         System.out.println("The largest number is: "+b);  
         else if (c > a && c > b)  
         System.out.println("The largest number is: "+c);  
         else  
         System.out.println("The numbers are same.");  
           }  

           system.out.println("abc method.......!);
       }



}

class demo5
{
     public static void main(string args[])
     {
        A a = new A();// constructor always try to craete only once 
        a.abc();
        a.abc();
        a.abc();// desplay method multiple times

}
}



//   constructor                           method

//  same name as class name       same+other name also

//   no return type               must have return type

//    always try creat once       utiloze with multiple time

//   internally allocate the memory    but no memory it juast utiliz same memory