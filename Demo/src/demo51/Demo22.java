package demo51;
class ABBBB
{
    int a;//0
    ABBBB(){}
}
class A1{}
//class A2 extends A1,A{}
abstract class BBBBB
{
    int a;// 0
    BBBBB(){}
}
interface I
{
    //int a;
    //I(){}
    void abc();
}
interface J{}
interface K extends J,I{}
class Demo22
{
    public static void main(String args[])
    {           
        //I i = new I();no    
    }
}