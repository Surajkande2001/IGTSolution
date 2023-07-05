package p3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

 

class Emp {

}

 

public class Demo4
{
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(100);
        a.add("ram");
        a.add(10.5);
        a.add('A');
        a.add(true);
        a.add(new Thread());
        a.add(new Date());
        a.add(new Emp());
//         System.out.println(a);

 

        System.out.println("===============");

 

        for (int i = 0; i< a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("===============");

        Iterator i = a.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}