package Patter_Programming;

import java.util.Scanner;

public class numbers_repeated_each_column
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();


        repeated_Column(rows);
    }

    private static void repeated_Column(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=rows ; j++)
            {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
