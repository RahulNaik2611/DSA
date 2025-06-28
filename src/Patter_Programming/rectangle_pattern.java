package Patter_Programming;

import java.util.Scanner;

public class rectangle_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows here:  ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns here: ");
        int col =sc.nextInt();

        recatngle(rows,col);
    }

    private static void recatngle(int rows, int col)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
