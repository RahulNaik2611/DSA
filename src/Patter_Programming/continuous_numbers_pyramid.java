package Patter_Programming;

import java.util.Scanner;

public class continuous_numbers_pyramid
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows here : ");
        int rows = sc.nextInt();

        continous_pyramid(rows);
    }

    private static void continous_pyramid(int rows)
    {
        int current_num = 1;

        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=rows-i ; j++)
            {
                System.out.print(" ");

            }

            for (int k = 1; k < i; k++)
            {
                System.out.print(current_num + " ");
                current_num ++ ;

            }
            System.out.println();

        }
    }
}
