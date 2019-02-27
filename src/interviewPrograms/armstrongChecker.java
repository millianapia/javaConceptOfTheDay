package interviewPrograms;

import java.util.Scanner;

public class armstrongChecker {

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Type number to check: ");
        int number = inn.nextInt();
        System.out.println("Is it armstrong?: " + armstrongCheck(number));
    }

    private static boolean armstrongCheck(int number) {
        int copyOfNumber = number;

        int noOfDigits = String.valueOf(number).length();

        int sum = 0;

        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;

            int lastDigitToThePowerOfNoOfDigits = 1;

            for (int i = 0; i < noOfDigits; i++) {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }

            sum = sum + lastDigitToThePowerOfNoOfDigits;

            copyOfNumber = copyOfNumber / 10;
        }

        if (sum == number) {
            return true;
        }

        return false;
    }
}
