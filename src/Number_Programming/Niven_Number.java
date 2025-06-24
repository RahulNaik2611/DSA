package Number_Programming;

import java.util.Scanner;

public class Niven_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here to Check : ");
        int number = sc.nextInt();

        System.out.println(Harshad_number(number));

    }

    private static boolean Harshad_number(int number)
    {
        int niven = number;
        int sum = 0 ;

        while (niven != 0 )
        {
            int remainder = niven % 10 ;
            sum +=remainder;
            niven/=10;
        }

        if (number % sum == 0 )
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }
}
