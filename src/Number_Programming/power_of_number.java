package Number_Programming;

import java.util.Scanner;

public class power_of_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base here :");
        int base = sc.nextInt();;
        System.out.println("Enter the exponent here : ");
        int exponent = sc.nextInt();

        int Pow = Power(base,exponent);

        System.out.println(base + "^" + exponent + "=" + Pow);
    }

    private static int Power(int base, int exponent)
    {
        int result = 1 ;

        for (int i = 1; i <=exponent ; i++)
        {
            result *= base;

        }
        return result;
    }
}
