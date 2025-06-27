package Number_Programming;

import java.util.Scanner;

public class happy_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Happy number: ");
        int num = sc.nextInt();

        if (ishappy_number(num)) {
            System.out.println(num + " is a Happy number.");
        } else {
            System.out.println(num + " is NOT a Happy number.");
        }

    }

    private static boolean ishappy_number(int num)
    {
        int slow = num ;
        int fast = num;

        do {
            slow = digtSqrtSum(slow);
            fast= digtSqrtSum(digtSqrtSum(fast));
        }while (slow != fast);

        return slow == 1;
    }

    private static int digtSqrtSum(int num)
    {
        int sum = 0 ;

        while (num > 0 )
        {
            int digit = num % 10;
            sum +=digit * digit;
            num /=10;
        }
        return sum;
    }
}
