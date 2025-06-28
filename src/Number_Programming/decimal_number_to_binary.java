package Number_Programming;

import java.util.Scanner;

public class decimal_number_to_binary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binary = decimalToBinary(number);
        System.out.println("Binary representation: " + binary);
    }

    private static String decimalToBinary(int number)
    {
        String binary = " ";

        if (number == 0 ) return "0";

        while (number >0)
        {
            int remainder = number %2;
            binary = remainder + binary;
            number/=2;
        }
        return binary;

    }
}
