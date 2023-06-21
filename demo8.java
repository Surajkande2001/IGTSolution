class parent

{

   int site = 5;
   int mopney = 500000;
   string car = "BMW";
}
class child extends parent
{

   int money = 10000;
   void use()
        {
 
System.out.println("SITE :"+site);
System.out.println("chile MONEY :"+money);
System.out.println("Parent MONEY  :"+super.money);
System.out.println("Both :"+(super.money+money));
System.out.println("CAR :"+car);
}
}

class demo8
{
         public static void main(String args[])
           {

               child c = new child();
               c.use();

}
}


