package Patter_Programming;

import java.util.Scanner;

public class numbers_repeated_rows
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows here: ");
        int rows = sc.nextInt();

        repeated(rows);
    }

    private static void repeated(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }
}
