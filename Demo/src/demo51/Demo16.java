package demo51;
class Empe
{
    Empe(int id, String name , int age , int salary , String desig, String pan)
    {
        System.out.println(" yes perferct  HR ");
    }
    Empe(int id, String name , String project, String loc)
    {
        System.out.println(" yes perferct  manager ");    
    }

}
class  Demo16
{
    public static void main(String args[])
    {
         Emp e = new Empe(100,"Rama",35,45678,"Dev","ABC123");
        Emp e2 = new Empe(100,"Rama","Facebok","Banglore");
    }    
}
// HR  : id, name ,age , salry , loc,
// manager  :id , name , project , location 

//has context menu