public class SelectionSort{
    // Selection Sort
    public static int[] selectionSort(int arr[]){
        int len = arr.length;
        int index = 0;
        // Iterate through the array
        for(int i=0; i<len; i++){
            int small = arr[i];
            for(int j=i; j<len-1; j++){
                // Find the smallest element
                if(small > arr[j]){
                    small = arr[j];
                    index = j;
                }
            }
            // Swap after searching
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
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
        int sortedArr[] = selectionSort(arr);
        print(sortedArr);
    }
}
