package interviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class occurencesInString {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("What word to count occurences");
        String input = inn.nextLine();
        HashMap<Character, Integer> occurences = occurences(input);
        System.out.println(occurences);    }

    private static HashMap<Character, Integer> occurences(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = input.toCharArray();
        for (char i:strArray) {
            if (charCountMap.containsKey(i)) charCountMap.put(i, charCountMap.get(i)+1);
            else charCountMap.put(i, 1);
        }
        return charCountMap;
    }
}
