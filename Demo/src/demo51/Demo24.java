package demo51;

class ABB
{
       static int x =10;
       static void abc()
       {
            System.out.println("HI abc method");
       }

}

class Demo24
{
     public static void main(String args[])
     {
          ABB.abc();
         System.out.println("X :"+ ABB.x);
     }
}