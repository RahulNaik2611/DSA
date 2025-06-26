package Number_Programming;

import java.util.Scanner;

public class magic_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int number = sc.nextInt();

        if (is_magicNumber(number))
        {
            System.out.println(number+" " + "Magic_number");
        }
        else {
            System.out.println(number + " " + "Not magic number");
        }
    }

    private static boolean is_magicNumber(int number)
    {
        while (number > 9 )
        {
            int sum = 0;
            while (number >0)
            {
                int rem = number % 10;
                sum += rem;
                number /=10;
            }
            number = sum;
        }
        return number ==1;
    }
}
