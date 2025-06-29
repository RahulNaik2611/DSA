package Strings;

import java.util.Scanner;

public class length_of_a_string
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String name = sc.next();

        //we are using String.length() method to get length of Strings

        int count = 0;
        for (int i = 1; i <= name.length(); i++)
        {
            count++;

        }
        System.out.println( "length of your String is : " + " " +  count);
    }
}
