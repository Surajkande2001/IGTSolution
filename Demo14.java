class A
{

        A()
         {
            System.out.println("A()");
         }
         A(int a)
         {
              System.out.println("A(int a)");
         }
         A(int a,String name)
         {
               System.out.println("A(int a,String name)");
         }
}
class Demo15
{
   public static void main(String args[])
    {
        A a = new A();
        A a1 = new A(100);
        A a2 = new A(200,'suprit');
    }
}


// overloading
//same constructor name + multiple time + different parameter +in same class = is called constructor overloading