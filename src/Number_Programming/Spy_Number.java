package Number_Programming;

import java.util.Scanner;

public class Spy_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();

        Spy(num);
    }

    private static void Spy(int num)
    {
        int sum = 0, prod = 1;

        while (num != 0)
        {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num/=10;
        }
        if (sum == prod)
        {
            System.out.println("It's Spy number ");
        }
        else {
            System.out.println("Not a Spy number ");
        }
    }
}
