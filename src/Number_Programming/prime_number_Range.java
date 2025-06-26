package Number_Programming;

import java.util.Scanner;

public class prime_number_Range
{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Starting number :");
        int start = sc.nextInt();
        System.out.println("Enter the End number :");
        int end = sc.nextInt();

    Range_prime_number(start,end);
    }

    private static void Range_prime_number(int start, int end)
    {
        for (int i = start; i <end ; i++)
        {
            if(isprime_Number(i)){
                System.out.println(i + " ");
            }

        }
    }

    private static boolean isprime_Number(int num)
    {
        if (num <=1)
        {
            return false;
        }
        if (num ==2)
        {
            return true;
        }

        if (num % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i <num ; i++)
        {
            if (num % i ==0)
            {
                return false;
            }

        }
        return true;
    }

}
