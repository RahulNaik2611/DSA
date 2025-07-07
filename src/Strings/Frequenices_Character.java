package Strings;

import java.util.Scanner;

public class Frequenices_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String st = sc.nextLine(); // Use nextLine() to read whole line

        st = st.toLowerCase(); // To handle uppercase letters

        int count[] = new int[26];

        for (int i = 0; i < st.length(); i++) { // Start at i = 0
            char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Count only letters
                count[ch - 'a']++;
            }
        }

        System.out.println("Character frequencies:");
        for (int j = 0; j < 26; j++) { // Start at j = 0
            if (count[j] > 0) {
                System.out.println((char) (j + 'a') + " : " + count[j]);
            }
        }

        sc.close();
    }
}
