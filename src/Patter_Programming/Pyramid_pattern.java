package Patter_Programming;

import java.util.Scanner;

public class Pyramid_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows here : ");
        int rows = sc.nextInt();

        pyramid(rows);
    }

    private static void pyramid(int rows)
    {

            for (int i = 1; i <=rows ; i++)
            {
                for (int j = 1; j <=rows-i ; j++)
                {
                    System.out.print(" ");

                }
                for (int k = 1; k <=(2 * i - 1); k++)
                {
                    System.out.print("*");

                }
                System.out.println();
            }
        }


}
