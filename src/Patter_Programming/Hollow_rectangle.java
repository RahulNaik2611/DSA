package Patter_Programming;

import java.util.Scanner;

public class Hollow_rectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows here : ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        Hollow(rows,cols);
    }

    private static void Hollow(int rows, int cols)
    {
        for (int i = 1; i <=rows; i++)
        {
            for (int j = 1; j <=cols ; j++)
            {
                if (j==1 || i==1||i==rows||j==cols)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
