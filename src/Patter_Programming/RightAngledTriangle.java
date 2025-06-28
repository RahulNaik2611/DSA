package Patter_Programming;

import java.util.Scanner;

public class RightAngledTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows ");
        int rows = sc.nextInt();


        rightAngle(rows);

    }

    private static void rightAngle(int rows)
    {
        for (int i = 1; i <=rows; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");

            }
            System.out.println( );

        }
    }
}
