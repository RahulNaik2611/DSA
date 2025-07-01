package Patter_Programming;

import java.util.Scanner;

public class Floyds_triangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows here : ");
        int row = sc.nextInt();

        patters(row);

    }

    private static void patters(int row)
    {
        int number = 1;

        for (int i = 1; i <=row ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();

        }
    }
}
