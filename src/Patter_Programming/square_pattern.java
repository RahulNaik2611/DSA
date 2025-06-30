package Patter_Programming;

import java.util.Scanner;

public class square_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();

        square(rows);
    }

    private static void square(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=rows ; j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
