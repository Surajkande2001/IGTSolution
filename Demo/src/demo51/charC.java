package demo51;

import java.util.Scanner;

public class charC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int characterCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != ' ') {
                characterCount++;
            }
        }

        System.out.println("The number of characters in the string is: " + characterCount);

        sc.close();
    }
}
