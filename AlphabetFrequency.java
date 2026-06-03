//write a java program to check frequencies of the alphabet in the given string provided by the user. 


import java.util.Scanner;
public class AlphabetFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}