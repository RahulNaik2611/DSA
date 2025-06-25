package Number_Programming;

import java.util.Scanner;

public class automorphic_Number
{
    //76^2 == 5776 last digits are same original


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }
    }

    private static boolean isAutomorphic(int number)
    {
        int square = number * number;
        int temp = number;
        int count = 0 ;
        int modulus = 1;
        int last_Digits;


        while (temp > 0)
        {
            count++;
            temp/=10;
        }

        for (int i = 1; i <=count ; i++)
        {
            modulus *=10;

        }
        last_Digits = square % modulus;

        return last_Digits== number;
    }
}
