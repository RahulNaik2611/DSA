package Number_Programming;

import java.util.Map;
import java.util.Scanner;

public class Kaprekar_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        if (is_KaprekarNumber(number))
        {
            System.out.println(number + " " + " is a Kaprekar number. ");
        }
        else {
            System.out.println(number + " " + " Not  a Kaprekar number." );
        }


    }

    private static boolean is_KaprekarNumber(int number)
    {
        int square = number * number;
        int temp = square;
        int count =0;

        while (temp > 0 )
        {
            count++;
            temp/=10;
        }

        for (int i = 0; i < count; i++)
        {
            int divisor = (int)Math.pow(10,i);

            int left  = square / divisor;
            int right = square % divisor;


            if (right > 0 && left + right == number)
            {
                return  true;
            }
        }
        return  false;
    }
}
