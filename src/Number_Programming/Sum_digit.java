package Number_Programming;

import java.util.Scanner;

public class Sum_digit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit here ; ");
        int Digit  = sc.nextInt();

        System.out.println(Sum(Digit));
    }

    private static int Sum(int digit)
    {
        int prod = 0;
        while (digit != 0 )
        {
            int remainder = digit % 10;

            prod += remainder;
            digit/=10;


        }
        return prod;
    }
}
