package Patter_Programming;

import java.util.Scanner;

public class hollow_rhombus_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows here : ");
        int rows = sc.nextInt();


        hollow_rhombus(rows);
    }

    private static void hollow_rhombus(int n)
    {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
