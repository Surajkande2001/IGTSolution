package fileproject;
import java.util.*;
import java.io.*;

 

class Demo1 {

 

    public static void main(String[] args) {

 

        try {

 

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

            System.out.println("Enter Id: ");
            int id = Integer.parseInt(br.readLine());

 

            System.out.println("Enter First Name: ");
            String fname = br.readLine();

 

            System.out.println("Enter Last Name:");
            String lname = br.readLine();

 

            System.out.println("Id: " + id);
            System.out.println("First Name:" + fname);
            System.out.println("Last Name:" + lname);
        } catch (Exception e) {

 

            System.out.println(e);
        }
    }
}