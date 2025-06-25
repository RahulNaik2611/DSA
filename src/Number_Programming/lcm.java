package Number_Programming;

import java.util.Scanner;

public class lcm
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here to First_Number : ");
        int first = sc.nextInt();

        System.out.println("Enter the Second number ");
        int second = sc.nextInt();

        int LCM = LCM_Calculator(first,second);
        System.out.println("lCM of " + first + " and " + second + " is: " + LCM);


    }

    private static int LCM_Calculator(int first, int second)
    {
        return (first * second) / findGcd(first,second);
    }

    private static int findGcd(int first, int second)
    {
        while (second != 0 )
        {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
