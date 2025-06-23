package Number_Programming;


// Check whether a number is palindrome or not


import java.util.Scanner;

public class palindrome_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :  ");
        int number = sc.nextInt();


       if(isPalidrome(number) == number)
       {
           System.out.println(number + " " + "palindrome number ");
       }
       else
       {
           System.out.println(number + " " + "isn't a palindrome number ");

       }
    }

    private static int isPalidrome(int number)
    {
        int DuplicateStorage = number ,sum = 0;

        while (DuplicateStorage != 0)
        {
            int Remainder = DuplicateStorage % 10;  //  Extract the Decimal number
            sum = (sum * 10 ) + Remainder;  // BO-DAMS RULE used here
            DuplicateStorage/=10;  //Remove the last digit

        }

        return sum;




    }
}
