package Patter_Programming;


import java.util.Scanner;

public class LeftAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows here: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

