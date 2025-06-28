package Patter_Programming;

import java.util.Scanner;

public class LeftAngledInvertedTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows here : ");
        int rows = sc.nextInt();

        left_Angled_Inverted(rows);
    }

    private static void left_Angled_Inverted(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = rows; j >=i; j--)
            {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
