package Number_Programming;

import java.util.Scanner;

public class Duck_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Duck number: ");
        String number = sc.next(); // Taking input as String to check leading 0

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is NOT a Duck Number.");
        }
    }

    private static boolean isDuckNumber(String number)
    {
        if (number.charAt(0) == '0')
        {
            return false;
        }

        for (int i = 1; i <number.length() ; i++)
        {
            if (number.charAt(i) == '0')
            {
                return  true;
            }
            
        }
        return  false;
    }
}
