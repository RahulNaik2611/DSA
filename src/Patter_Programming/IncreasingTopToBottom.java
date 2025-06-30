package Patter_Programming;

import java.util.Scanner;

public class IncreasingTopToBottom
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows : ");
        int rows = sc.nextInt();

        Pattern(rows);


    }

    private static void Pattern(int rows)
    {
        for (int i = rows; i >=1 ; i--)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
