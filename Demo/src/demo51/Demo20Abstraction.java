package demo51;

abstract class Abbbb
{
    abstract void abc();
}
abstract class Bbbbb extends Abbbb
{
     void abc()
      {
       System.out.println("ABC method");
      }
       abstract void xyz();
}
class Cbbbb extends Bbbbb 
{
    void xyz()
      {
          System.out.println("xyz method");
       }

}

class Demo20Abstraction
{
    public static void main(String args[])
    {
    	Cbbbb  c = new Cbbbb ();
         c.abc();
         c.xyz();
}
}
