package Number_Programming;

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Armstrong_number_Range
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number :");
        int start = sc.nextInt();
        System.out.println("Enter the End number :");
        int end = sc.nextInt();

        Range(start,end);
    }

    private static void Range(int start, int end)
    {
        for (int i = start; i <end ; i++)
        {
            if (is_Armstrong_number(i))
            {
                System.out.println(i + " ");
            }

        }
    }

    private static boolean is_Armstrong_number(int number)
    {
        int sum = 0 ;
        int Duplicate = number;
        int power = count(number), ArmstrongNumber = 0;


        while (Duplicate >0)
        {
            int rem = Duplicate % 10;
            ArmstrongNumber += Math.pow(rem,power);
            Duplicate/=10;

        }
        if (number == ArmstrongNumber)
        {
            return true;
        }
        else {
            return false;
        }


    }

    private static int count(int number)
    {
        int count = 0 ;
        while (number !=0 )
        {
            int remainder = number % 10 ;
            count ++;
            number /=10;
        }
        return count;
    }
}
