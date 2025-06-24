package Number_Programming;


// Print the Fibonacci series up to N terms

import java.util.Scanner;

public class Fibonacci_series
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms (N)  : ");
        int number = sc.nextInt();


        System.out.println("Fibonacci Series up to " + number  + " terms:");

        int first = 0, second = 1;

        for (int i = 1; i <=number ; i++)
        {
            System.out.println( first + " ");

            int third = first + second;
            first = second;
            second = third;
            
        }
    }
}
