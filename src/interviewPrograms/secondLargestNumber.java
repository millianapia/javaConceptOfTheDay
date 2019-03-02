package interviewPrograms;

import java.util.Arrays;

public class secondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 5, 8, 7, 6, 4, 1, 7};
        int[] arr2 = {1, 5, 6, 8, 4, 7};
        System.out.println(secondLargestSort(arr));
        System.out.println(secondLargestSort(arr2));


    }

    private static int secondLargestSort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

}
