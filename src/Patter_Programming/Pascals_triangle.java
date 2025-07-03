package Patter_Programming;

import java.util.Scanner;

public class Pascals_triangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows : ");
        int rows = sc.nextInt();

        pascal(rows);
    }

    private static void pascal(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;  // ✅ Reset for each row

            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / k;
            }
            System.out.println();
        }
    }
}