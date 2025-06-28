package Number_Programming;

import java.util.Scanner;



public class palprime_palindrome_prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :  ");
        int number = sc.nextInt();

        if (isPalindrome(number) && isPrime(number)) {
            System.out.println(number + " is a Palprime number.");
        } else {
            System.out.println(number + " is NOT a Palprime number.");
        }
    }

    private static boolean isPrime(int number)
    {
        if (number ==1) return false;
        if(number == 2) return true;
        if (number %2 ==0) return  false;

        for (int i = 3; i <=Math.sqrt(number) ; i+=2)
        {
            if (number % i == 0)
            {
                return false;
            }

        }
        return true;
    }

    private static boolean isPalindrome(int number)
    {
        int Duplicate_number = number;
        int sum = 0;

        while (number > 0 )
        {
            int remainder = number % 10;
            sum = (sum * 10) + remainder;
            number /=10;
        }
        return Duplicate_number == sum;

    }
}
