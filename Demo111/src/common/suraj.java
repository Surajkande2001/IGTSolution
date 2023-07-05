package common;

class A{
    A(){
        System.out.println("A class Construter");
    }
    void abc() {
        System.out.println("abc method");
    }
}

public class suraj {
	public static void main(String args[])
    {
        A a = new A();
        a.abc();
    }

}


 