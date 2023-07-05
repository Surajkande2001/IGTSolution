class Emp
{
    class Insert
     {
         Insert()
           {
           System.out.println("Insert class");            
            }
          void abc()
          {
            System.out.println("insert class abc method");  
        }
        }
        class Display
          {
              Display()
             {
           System.out.println("Display class");                        
           }
          void xyz()
            {
      System.out.println("Display class abc method"); 
           }
}
}

class Demo43
{
          public staic void main(String args[])
          {
               System.out.println("HI Demo43"); 
             Emp e = new Emp();
              Emp.insert ins = e.new.Insert();
              ins.abc();
}
}
