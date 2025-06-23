package Number_Programming;


// Find the factorial of a given number.

import java.util.Scanner;

public class factorial_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :  ");
        int number = sc.nextInt();

        System.out.println(factorial(number));

    }

    private static int factorial(int number)
    {
        int fact =1;

        for (int i = 1 ; i <=number ; i++)
        {
            fact = fact  * i;

        }
        return fact;
    }


}
