package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class anagramChecker {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("First word to be checked");
        String input1 = inn.nextLine();
        System.out.println("Second word to be checked");
        String input2  = inn.nextLine();
        System.out.println(anagramCheckSort(input1,input2));
    }

    private static boolean anagramCheckSort(String input1, String input2) {
        String input1wo = whiteSpaceRemover.builtIn(input1);
        String input2wo = whiteSpaceRemover.builtIn(input2);

        char[] input1Char = input1wo.toCharArray();
        char[] input2Char = input2wo.toCharArray();
        Arrays.sort(input1Char);
        Arrays.sort(input2Char);

        return Arrays.equals(input1Char, input2Char);
    }
}
