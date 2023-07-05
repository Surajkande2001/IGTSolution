class Demo33
{
      public static void main(String args[])
        {
            m1();
        }
        static void m1()
        {
            m2();
         System.out.println("M1 method")
        }
        staic void m2()
         {
             m3();
        System.out.println("M2 method")
         }
        staic void m3()
       {
          try
         {
             File f = new File("abc.txt");
             FileReader fr = new FileReader(f);
          }
         catch(FileNotFoundException e)
         {
         System.out.println("Something went wrong with this file");
         }
           finally
           {
              System.out.println("Thank you");
             }
}
}
            
        
               
 }