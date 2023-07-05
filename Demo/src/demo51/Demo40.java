package demo51;

class ACB extends Thread
{

      public synchronized void run()
         {
           try
           {
               for(int i=0;i<=10;i++)
           {

              if(Thread.currentThread().getName().equals("rama")){
                 System.out.println(Thread.currentThread().getName()+" : "+i);
            }
          if(Thread.currentThread().getName().equals("seetha")){
                 System.out.println("        "+ Thread.currentThread().getName()+" : "+i);
           }
           Thread.sleep(1000);
       }
}
   catch(Exception e){}
}
}

class Demo40
{
     public static void main(String args[])
      {
    	 ACB a = new ACB();
         Thread t1 = new Thread(a);
         Thread t2 = new Thread(a);
          t1.start();
          t2.start();

        t1.setName("Rama");
        t2.setName("seetha");

}
}
          