import java.util.scanner;
class A 
{

   inr uid;string name;int salary;string desig;
   A()
   {
       scanner sc  = new scanner(system.in);
         system.out.print("Enter The ID ?");
          uid = sc.nextInt();

   
          system.out.print("Enter The Name ?");
          name = sc.next();

         system.out.print("Enter The Age")
          age = sc.nextInt();
     
    

         system.out.print("Enter The salary")
          salary = sc.nextInt();

          system.out.print("Enter The Desiganation ?");
          designation = sc.next();
}
  void display()
{
   system.out.println("ID : "+uid);
    system.out.println("name : " +name);
    system.out.println("Age : "+age);
    system.out.println("salary : "+salary);
    system.out.println("Designation : "+designation );
}
}

class demo4
{
   public static void main(string args[])
   {
    system.out.println("Demo3");
    A a = new A();
    a.dispaly();

}
}
    


