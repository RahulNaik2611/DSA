package Number_Programming;

import java.util.Scanner;

public class sum_of_the_first_N_natural
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = sumOfNaturalNumbers(N);
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
    }

    private static int sumOfNaturalNumbers(int n)
    {
        return n * (n + 1) / 2;
    }
}
