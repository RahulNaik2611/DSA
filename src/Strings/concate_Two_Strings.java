package Strings;

import java.util.Scanner;

public class concate_Two_Strings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FirstName : ");
        String firstName = sc.next();
        System.out.println("Enter the lastName : ");
        String lastName = sc.next();

        String fullName = firstName.concat(lastName);   //String[0]1018
        System.out.println(fullName);



        // or

//        String fullname1 = firstName + "  " + lastName;  //same object_id share meand same memory they are sharing--> //String[0]1018
//        System.out.println(fullName);
    }
}
