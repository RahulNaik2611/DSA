package Number_Programming;

import java.util.Scanner;

public class GCD
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number here to First_Number : ");
            int first = sc.nextInt();

            System.out.println("Enter the Second number ");
            int second = sc.nextInt();

            int gcd = GCD_Calculator(first,second);
            System.out.println("GCD of " + first + " and " + second + " is: " + gcd);


        }

    private static int GCD_Calculator(int first, int second)
    {
        while (second != 0)
        {
            int temp = second;
            second = first % second;
            first = temp;



        }
        return first;
    }
}
