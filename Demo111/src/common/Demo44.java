package common;

import java.util.*;
class ABA
{
    ABA()
     {
        ArrayList<Integer>  a1 = new ArrayList<Integer>();
        a1.add(100);
        a1.add(300);
        a1.add(400);
        a1.add(700);
        a1.add(2,45356);

       Iterator i = a1.iterator();
       while(i.hasNext())
       {
         System.out.println(i.next());
      } 
       
       Date d = new Date();
       System.out.println(d);
   }
 }

public class Demo44
  {
       public static void main(String args[])
      {
          ABA a = new ABA();
}
}
