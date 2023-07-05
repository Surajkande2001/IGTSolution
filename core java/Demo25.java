class car
{
     final int speed = 200;
     final void run()
     {
         System.out.println("HI run method with speed of 200");
     }

}

classs Maruthi extend car
{
 }

class Demo25
{
     public static void main(String args[])
     {
         Car c= Car();
         c.run();
         System.out.println("Speed"+c.speed);
         System.out.println("Speed"+c.speed);

         Maruthi m = new Maruthi();
         m.run();
}
}