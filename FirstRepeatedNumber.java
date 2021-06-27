import java.util.HashMap;
public class FirstRepeatedNumber{
    static String firstRepeated(int arr[]){
        HashMap<Integer, Boolean> repetitionMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(repetitionMap.get(arr[i])!=null){
                return Integer.toString(arr[i]);
            }
            repetitionMap.put(arr[i], true);
        }
        return "undefined";
    }
    public static void main(String []args){
        // Google Interview Question:
        // Which number gets repeated first?
        // Given an Array = [2, 5, 1, 2, 3, 5, 1, 2, 4];
        // It Should Return 2
        
        // Given an Array = [2, 1, 1, 2, 3, 5, 1, 2, 4];
        // It Should Return 1
        
        // Given an Array = [2, 3, 4, 5]
        // It should return undefined
        
        // Example 1
        int arr1[] = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        System.out.println(firstRepeated(arr1));
        // Example 2
        int arr2[] = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        System.out.println(firstRepeated(arr2));
        // Example 3
        int arr3[] = new int[]{2, 3, 4, 5};
        System.out.println(firstRepeated(arr3));
    }
}
