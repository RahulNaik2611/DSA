package Number_Programming;

import java.util.Scanner;

public class neon_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here  : ");
        int number = sc.nextInt();

        int stored = neon(number);
        if (stored == number)
        {
            System.out.println("Neon number ");
        }
        else {
            System.out.println("Not a Neon number ");
        }



    }

    private static int neon(int number)
    {
        int sqrt = number * number;
        int sum = 0;

        while (sqrt > 0 )
        {
            sum += sqrt % 10 ;
            sqrt/=10;
        }
        return sum;
    }
}
