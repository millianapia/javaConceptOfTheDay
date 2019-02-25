package interviewPrograms;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        boolean active = true;
        Scanner reader = null;

        while(active) {
             reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("String to be reversed ");
            String reversed = reader.nextLine(); // Scans the next token of the input as an int.
            System.out.println("Reverse using stringbuffer class: 1");
            System.out.println("Reverse using iterative method: 2");
            System.out.println("Reverse using recursive method: 3");
            System.out.println("exit: 4");
            int action = reader.nextInt(); // Scans the next token of the input as an int.

            if (action==4) active = false;
            else if(action == 1)System.out.println(reversed + " Backwards is " + stringBuffer(reversed));
            else if(action == 2)System.out.println(reversed + " Backwards is " + iterative(reversed));
            else if(action ==3) System.out.println(reversed + " Backwards is " + recursive(reversed));
            else System.out.println("Wrong number");

        }
        reader.close();


    }


    private static String stringBuffer(String reversedString){
        StringBuffer SB = new StringBuffer(reversedString);
        return SB.toString();
    }

    private static String iterative(String reversedString){
    char[] charArray = reversedString.toCharArray();
    String reversed = "";
        for (int i = charArray.length-1; i >= 0 ; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }

    private static String recursive(String reversedString){

        if ((null == reversedString) || (reversedString.length() <= 1))
        {
            return reversedString;
        }
        return recursive(reversedString.substring(1)) + reversedString.charAt(0);
    }

}
