package interviewPrograms;

import java.util.Scanner;

public class pyramidNumbers {

    public static void main(String[] args) {
        boolean active = true;
        Scanner reader = null;

        while (active) {
            reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("How many rows: ");
            int noOfRows = reader.nextInt(); // Scans the next token of the input as an int.
            System.out.println("What pattern will it be printed? ");
            System.out.println("Pyramid pattern: 1");
            System.out.println("Pyramid pattern: 2");
            System.out.println("Pyramid pattern: 3");
            System.out.println("Pyramid pattern: 4");
            System.out.println("Pyramid pattern: 5");
            System.out.println("Pyramid pattern: 6");
            System.out.println("exit: 0");

            int action = reader.nextInt(); // Scans the next token of the input as an int.

            if (action == 0) active = false;
            else if (action == 1) pattern1(noOfRows);
            else if (action == 2) pattern2(noOfRows);
            else if (action == 3) pattern3(noOfRows);
            else if (action == 4) pattern4(noOfRows);
            else if (action == 5) pattern5(noOfRows);
            else if (action == 6) pattern6(noOfRows);
            else System.out.println("Wrong number");

        }
        reader.close();

    }

    public static void pattern1(int rows) {
        int rowCount = 1;
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;

        }
    }

    public static void pattern2(int rows) {
        int rowCount = 1;
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rowCount; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void pattern3(int rows) {
        int rowCount = 1;
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void pattern4(int rows) {
        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = rows; i > 0; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j value where j value will be from 1 to rowCount

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            //Printing j value where j value will be from rowCount-1 to 1

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }

    }

    public static void pattern5(int rows) {
        for (int i = 0; i < rows; i++) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j where j value will be from 1 to rowCount

            for (int j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }

            //Printing j where j value will be from rowCount-1 to 1

            for (int j = rows - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Decrementing the rowCount

            rows--;
        }
    }


    public static void pattern6(int rows) {
        int rowCount = 1;
        for (int i = rows; i >= 1; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j where j value will be from i to noOfRows

            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }

            //Printing j where j value will be from noOfRows-1 to i

            for (int j = rows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }

    }
}
