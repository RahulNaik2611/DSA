package Number_Programming;


//   Check whether a number is prime or not.

import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here:  ");
        int number = sc.nextInt();

        if (isPrime(number))
        {
            System.out.println(number + " " + "Prime Number ");
        }
        else {
            System.out.println(number + "isn't a prime Number ");
        }
        sc.close();
    }

    private static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        if (number == 2)
        {
            return true;
        }

        if(number %2 ==0)
        {
            return false;
        }

        for (int i = 3; i <Math.sqrt(number) ; i+=2)
        {
            if (number % i ==0)
            {
                return  false;
            }

        }
        return true;
    }
}
