import java.util.Arrays;
public class MergeSort{
    // Merge Sort
    public static int[] mergeSort(int arr[]){
        if(arr.length <= 1){
            return arr;
        }
        int len = arr.length;
        int middle = len/2;
        int left[] = Arrays.copyOfRange(arr, 0, middle);
        int right[] = Arrays.copyOfRange(arr, middle, len);
        return merge(mergeSort(left), mergeSort(right));
    }
    // Merge 2 sorted arrays
    public static int[] merge(int arr1[], int arr2[]){
        // Maintain an array for Result
        int mergedArr[] = new int[arr1.length + arr2.length];
        // Base Cases if any of the arrays received are empty
        if(arr1.length==0){
            return arr2;
        }
        if(arr2.length==0){
            return arr1;
        }
        int index = 0;
        int i=0;
        int j=0;
        // Add the elements in the array comparing two elements
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArr[index++] = arr1[i];
                i++;
            }
            else{
                mergedArr[index++] = arr2[j];
                j++;
            }
        }
        // Fill the rest of the sorted elements
        if(i<arr1.length){
            while(i<arr1.length){
                mergedArr[index++] = arr1[i];
                i++;
                
            }
        }
        else if(j<arr2.length){
            while(j<arr2.length){
                mergedArr[index++] = arr2[j];
                j++;
            }
        }
        return mergedArr;
    }
    
    // Printing Array
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[]{99, 22, 45, 1, 66, 93, 88, 10, 39, 22};
        int sortedArr[] = mergeSort(arr);
        print(sortedArr);
    }
}
