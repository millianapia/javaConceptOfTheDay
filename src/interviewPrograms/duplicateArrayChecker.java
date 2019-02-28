package interviewPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateArrayChecker {

    public static void main(String[] args) {
        int [] arr = {1,5,6,5,8,7,6,4,1,7};
        int [] arr2 = {1,5,6,8,4,7};
        System.out.println(checkIfDuplicateBrute(arr));
        System.out.println(checkIfDuplicateBrute(arr2));
        System.out.println(checkIfDuplicateSorting(arr));
        System.out.println(checkIfDuplicateSorting(arr2));
        System.out.println(checkIfDuplicateHashSet(arr));
        System.out.println(checkIfDuplicateHashSet(arr2));
        System.out.println(checkIfDuplicateHashMap(arr));
        System.out.println(checkIfDuplicateHashMap(arr2));
        System.out.println(checkIfDuplicateStream(arr));
        System.out.println(checkIfDuplicateStream(arr2));



    }

    private static String checkIfDuplicateStream(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicatedElements = Arrays.stream(arr)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());

        return duplicatedElements.toString();
    }

    private static boolean checkIfDuplicateHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element: arr){
            if (map.get(element) == null) map.put(element, 1);
            else map.put(element, map.get(element)+1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet){
            if(entry.getValue()>1) return true;
        }
        return false;
    }

    private static boolean checkIfDuplicateHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int element :arr) {
            if (!set.add(element)) return true;
        }
        return false;
    }

    private static boolean checkIfDuplicateSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] == arr[i+1]) return true;
        return false;
    }

    private static boolean checkIfDuplicateBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) return true;
            }
        }
        return false;
    }
}
