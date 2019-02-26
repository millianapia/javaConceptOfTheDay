package interviewPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* Finds duplicates and prints how many times*/
public class findingDuplicates {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Tell me your sentence");
        String str = inn.nextLine();

        HashMap<Character, Integer> charCountMap = new HashMap<>();


        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        Set<Character> charsInString = charCountMap.keySet();
        for (char ch : charsInString) {
        if (charCountMap.get(ch) > 1)
            System.out.println(ch +" : "+ charCountMap.get(ch));
        }

    }
}