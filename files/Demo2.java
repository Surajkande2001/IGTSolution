import java.util.*;
import java.io.*;
class Demo2
{
 public static void main(String args[])
 {
    String line = null;
   try
    {
      BufferReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter File name");
      String fname = br.readLine();
      
      File f = new File(fname);
      if(f.exists())
       {
          BufferReader br = new BufferedReader(new FileReader(fname));
          while(line = fr.readLine()!=null)
          {
           System.out.println(line);     
           }
         }
        else
          {
               System.out.println("Sorry...file not exist"); 
         }
    }
     catch(Exception e)
     { 
     }

}
}