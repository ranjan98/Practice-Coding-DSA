public class HelloWorld{
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
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
    public static void main(String []args){
        // Merge 2 Sorted Arrays
        int arr1[] = new int[]{ 1, 3, 6, 8};
        int arr2[] = new int[]{ 0, 4, 5, 9, 12};
        int mergedArr[] = mergeSortedArrays(arr1, arr2);
        for(int i=0;i<mergedArr.length;i++){
            System.out.print(mergedArr[i]+ " ");
        }
        // Output: 0 1 3 4 5 6 8 9 12
    }
}
