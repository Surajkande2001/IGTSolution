package p2;
import p1.A;

class D extends A{
	
	void display()
	{
		System.out.println(a1);
		System.out.println(c1);
}

}

class E
{
	 void display()
	 {
		 A a = new A();
		 System.out.println(a.a1);
	 }
}

class F extends A
{
	void display()
	{
		System.out.println(a1);
		System.out.println(c1);
	}
}
