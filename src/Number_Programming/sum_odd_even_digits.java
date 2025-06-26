package Number_Programming;

import java.util.Scanner;

public class sum_odd_even_digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number here :   ");
        int number = sc.nextInt();


        sum_by_Digits(number);
    }

    private static void sum_by_Digits(int number)
    {
        int add_even = 0;
        int add_odd = 0;
        while (number > 0 )
        {
            int rem = number % 10;
            if (rem % 2 ==0)
            {
                add_even += rem;
            }
            else
            {
                add_odd += rem;
            }
            number/=10;
        }
        System.out.println(add_even + " " + "sum even numbers ");
        System.out.println(add_odd + " " + "sum odd numbers " );
    }
}
