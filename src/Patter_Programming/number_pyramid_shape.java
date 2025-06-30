package Patter_Programming;

import java.util.Scanner;

public class number_pyramid_shape
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number rows :  ");
        int rows = sc.nextInt();

        pyramid_number(rows);

    }

    private static void pyramid_number(int rows)
    {
        for (int i = 1; i <rows ; i++)
        {
            for (int j = 1; j <rows-i ; j++)
            {
                System.out.print(" ");

            }
            for (int k = 1; k <=(2 * i - 1) ; k++)
            {
                System.out.print(k + " ");

            }
            System.out.println();

        }
    }
}
