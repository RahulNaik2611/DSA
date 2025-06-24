package Number_Programming;


// Check if a number is perfect or not.

//logic 6 → Divisors: 1, 2, 3 → 1 + 2 + 3 = 6 ✅ Perfect
//
//28 → Divisors: 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28 ✅ Perfect


import java.util.Scanner;

public class perfect_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :  ");

        int number = sc.nextInt();

        if(isPerfectNumber(number))
        {
            System.out.println("it's perfect number");

        }
        else {
            System.out.println("Not a perfect number");
        }
}

    private static boolean isPerfectNumber(int number)
    {
        int sum = 0 ;

        if (number <=1)
        {
            return false;
        }


        for (int i = 1; i <=number/2 ; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }

        }
        return  sum == number;



    }
    }
