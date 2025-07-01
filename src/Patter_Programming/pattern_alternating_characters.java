package Patter_Programming;

import java.util.Scanner;

public class pattern_alternating_characters
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        alternating_char(rows);

    }

    private static void alternating_char(int rows)
    {
        for (int i = 1; i <=rows ; i++)
        {
            char ch = 'A';
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(ch + " ");
                ch = (ch == 'A') ? 'B' : 'A';

            }
            System.out.println();

        }
    }
}
