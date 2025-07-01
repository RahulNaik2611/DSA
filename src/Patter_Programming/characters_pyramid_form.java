package Patter_Programming;

import java.util.Scanner;

public class characters_pyramid_form
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        characters(rows);

    }

    private static void characters(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            for (int j = 1; j <=rows ; j++)
            {
                System.out.print(" "
                );

            }


            char ch = 'A';
            for (int k = 1; k <=i ; k++)
            {
                System.out.print(ch + " ");
                ch++;

            }

            System.out.println();

        }
    }
}
