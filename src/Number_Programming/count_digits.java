package Number_Programming;

import java.util.Scanner;

public class count_digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalnumber = number;
        int count = 0 ;


        while (originalnumber!=0)
        {
            int digits = originalnumber %10;
            count ++;
            originalnumber/=10;


        }
        System.out.println(number + " " + "count of given number are : " + count);


    }
}
