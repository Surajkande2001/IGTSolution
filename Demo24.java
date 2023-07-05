class A
{
       static int x =10;
       static void abc()
       {
            System.out.println("HI abc method");
       }

}

class Demo24
{
     public static void main(string args[])
     {
          A.abc();
         System.out.println("X :"+ A.x);
     }
}