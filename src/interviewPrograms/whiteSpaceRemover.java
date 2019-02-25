package interviewPrograms;

import java.util.Scanner;

public class whiteSpaceRemover {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Write what you want whitespace removed from");
        String str = inn.nextLine();
        builtIn(str);
        charMethod(str);
    }

    public static void builtIn(String str){
        System.out.println(str.replaceAll("\\s+", ""));
    }

    public static void charMethod(String str){
        char[] charArray = str.toCharArray();
        String empty = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' '){
                empty += charArray[i];
            }
        }
        System.out.println(empty);
    }


    }
