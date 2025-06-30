package Patter_Programming;

import java.util.Scanner;

public class alternating_binary_pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();

        binary_pattern(rows,cols);
    }

    private static void binary_pattern(int rows, int cols)
    {
        for (int i = 1; i <rows ; i++)
        {
            for (int j = 1; j <cols ; j++)
            {
                if ((i + j) % 2 ==0)
                {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }
    }
}
