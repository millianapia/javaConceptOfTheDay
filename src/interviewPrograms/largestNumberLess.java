package interviewPrograms;

import java.util.Scanner;

public class largestNumberLess {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Give largest number to find");
        int number = inn.nextInt();
        System.out.println("what number should the largest number not have");
        int minus = inn.nextInt();
        System.out.println("Next largest number is: " + nextLargestWithout(number, minus));
    }

    private static int nextLargestWithout(int number, int minus) {
        char c = Integer.toString(minus).charAt(0);
        for (int i = number; i > 0 ; i--) {
            if (Integer.toString(i).indexOf(c) == -1) return i;
        }
        return -1;
    }
}
