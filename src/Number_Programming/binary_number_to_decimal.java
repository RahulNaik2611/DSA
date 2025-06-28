package Number_Programming;

import java.util.Scanner;

public class binary_number_to_decimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal representation: " + decimal);
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
