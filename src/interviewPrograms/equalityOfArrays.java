package interviewPrograms;

import java.util.Arrays;

public class equalityOfArrays {

    public static void main(String[] args) {
        int[] input1 = {2, 3, 4, 5};
        int[] input2 = {2, 3, 4, 5};
        System.out.println("iterative method: " + checkIfEqualIterative(input1, input2));
        System.out.println("built in method: " + checkIfEqualBuiltIn(input1, input2));
    }

    private static boolean checkIfEqualBuiltIn(int[] input1, int[] input2) {
        return Arrays.equals(input1, input2);
    }

    private static boolean checkIfEqualIterative(int[] input1, int[] input2) {
        boolean isEqual = false;

        if (input1.length == input2.length) {
            for (int i = 0; i < input1.length; i++) {
                if (input1[i] == input2[i]) isEqual = true;
                else isEqual = false;
            }
        }
        return isEqual;
    }


}
