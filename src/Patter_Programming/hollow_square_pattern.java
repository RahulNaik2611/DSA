package Patter_Programming;

import java.util.Scanner;

public class hollow_square_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the rows here : ");
        int rows = sc.nextInt();


        hollow_square(rows);
    }

    private static void hollow_square(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=rows ; j++)
            {
                if (i == 1 | j == 1 | i == rows | j == rows)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
