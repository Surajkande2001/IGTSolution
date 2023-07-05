class A
{

     int a =100;
      A()
      {
       }
      public void finalize()
        {
          System.out.println("object Removed......!");
          }
}
class B
{
     int b = 200;
     B()
      {
      }
      public void finalize()
        {
          System.out.println("object Removed......!");
          }
class Demo42
{

  public static void main(String args[])
  {
      A a1 = new A();
      B b1 =new B();
      System.out.println(a1.a);
      System.out.println(b1.a);
      a1 = null;
     b1 = null;
     System.gc();
       
        
 