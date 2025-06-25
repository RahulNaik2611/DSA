package Number_Programming;

import java.util.Scanner;

public class Strong_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();

        if (isStrong_number(num))
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not a Strong Number ");
        }
    }

    private static boolean isStrong_number(int num)
    {
        int original_number = num;

        int sum = 0 ;

        while (num != 0 )
        {
            int digit = num % 10 ;
            sum += factorial(digit);
            num/=10;
        }
        return sum == original_number;
    }

    private static int factorial(int remainder)
    {
        int fact = 1;

        for (int i = 2; i <=remainder; i++)
        {
            fact *= i;

        }
        return fact;
    }
}
