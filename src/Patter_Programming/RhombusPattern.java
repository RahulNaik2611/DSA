package Patter_Programming;

import java.util.Scanner;

public class RhombusPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows here : ");
        int rows = sc.nextInt();

        Rhombus(rows);
    }

    private static void Rhombus(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = rows; j >i ; j--)
            {
                System.out.print(" ");

            }

            for (int k = 1; k <=rows ; k++)
            {
                System.out.print("*");

            }

            System.out.println();

        }
    }
}
