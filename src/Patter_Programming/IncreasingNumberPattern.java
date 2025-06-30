package Patter_Programming;

import java.util.Scanner;

public class IncreasingNumberPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        IncreasingNumber(rows);
    }

    private static void IncreasingNumber(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
