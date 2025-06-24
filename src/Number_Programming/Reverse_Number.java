package Number_Programming;

import java.util.Scanner;


// Reverse a given number

public class Reverse_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = sc.nextInt();

        int converted = Reverse(num);

        System.out.println("original number (" + num + ")" + "Reverse number is : --> "  + converted);
    }

    private static int  Reverse(int num)
    {
        int sum = 0 ;

        while ( num !=0 )
        {
            int remainder = num % 10;
            sum = (sum * 10 ) + remainder;
            num /= 10 ;
        }
        return sum;
    }
}
