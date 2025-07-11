package Number_Programming;



import java.util.Scanner;

public class count_Natural_num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();

        System.out.println(Count_number(num));
    }

    private static int Count_number(int num)
    {
        return num * (num + 1)/2;
    }
}
