package demo51;



interface IJJ

{

   public static final int a=10;

   public abstract void add();

   void sub();

}

 

interface JJJ

{

   int b=20;

   void mul();

   void div();  

}

 

interface KJJ extends IJJ,JJJ

{


}

 

class Cal implements KJJ

{

  public void sub()

{

   System.out.println(IJJ.a - JJJ.b);

}

  public void add()

{

   System.out.println(IJJ.a + J.b);

}

  public void div()

{

   System.out.println(IJJ.a / JJJ.b);

}

  public void mul()

{

   System.out.println(IJJ.a * JJJ.b);

}

}

 

class Demo27

{

public static void main(String args[])

{

    System.out.println("=========Cal========");

    Cal c = new Cal();

    c.add();

    c.sub();

    c.div();

    c.mul();

 

    System.out.println("=========I interface========");

    IJJ i =c;

    i.add();

    i.sub();

    //i.div();

    //i.mul();

 

    System.out.println("=========J interface========");

    JJJ j = c;

    //j.add();

    //j.sub();

    j.div();

    j.mul();

 

    System.out.println("=========K interface========");

    K k = c;

    k.add();

    k.sub();

    k.div();

    k.mul();

 

} 

}
