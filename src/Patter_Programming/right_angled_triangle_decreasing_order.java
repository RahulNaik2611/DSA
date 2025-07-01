package Patter_Programming;

import java.util.Scanner;

public class right_angled_triangle_decreasing_order
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        decreasing_order(rows);
    }

    private static void decreasing_order(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = i; j >=1 ; j--)
            {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
