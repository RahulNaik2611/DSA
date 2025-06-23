package Number_Programming;

import java.util.Scanner;

public class Armstrong_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :  ");

        int number = sc.nextInt();

        int result = isArmstrong_Number(number);

        // Armstrong check
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }



    private static int isArmstrong_Number(int number)
    {
        int Duplicatenumber = number;
        int power = count(number);
        int Armstrong=0;

        while (Duplicatenumber !=0)
        {
            int remainder = Duplicatenumber % 10;
            Armstrong += Math.pow(remainder,power);
            Duplicatenumber/=10;


        }
        return Armstrong;


    }

    private static int count(int number)
    {
        int counter =0;
        while (number !=0)
        {
            number/=10;
            counter ++;

        }
        return  counter;
    }


}

